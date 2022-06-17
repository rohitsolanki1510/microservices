package com.homebrew.management;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class HomeBrewManagerApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void defaultTest() throws Exception {
		mockMvc.perform(get("/formula").param("name", "wget")).andDo(print()).andExpect(jsonPath("$.desc").isNotEmpty())
				.andExpect(jsonPath("$.versions").isNotEmpty()).andExpect(jsonPath("$.generated_date").isNotEmpty())
				.andExpect(jsonPath("$.dependencies").isNotEmpty()).andExpect(status().isOk());
	}

	@Test
	public void defaultTest404() throws Exception {
		mockMvc.perform(get("/formula").param("name", "X")).andDo(print()).andExpect(status().isNotFound());
	}

	@Test
	public void defaultTestWithEmptyPatam() throws Exception {
		mockMvc.perform(get("/formula").param("name", "")).andDo(print()).andExpect(status().isBadRequest());
	}

	@Test
	public void defaultTestWithoutParam() throws Exception {
		mockMvc.perform(get("/formula")).andDo(print()).andExpect(status().isBadRequest());
	}

	@Test
	public void defaultTestWithPost() throws Exception {
		mockMvc.perform(post("/formula").param("name", "wget")).andDo(print()).andExpect(status().isMethodNotAllowed());
	}

}
