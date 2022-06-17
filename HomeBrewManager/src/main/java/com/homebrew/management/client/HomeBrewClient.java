package com.homebrew.management.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.homebrew.management.model.FormulaDetailsHomebrewResp;

@FeignClient(name = "HomeBrew", url = "${homebrew.api.uri}")
public interface HomeBrewClient {

	@GetMapping("/formula/{FORMULA}.json")

	public FormulaDetailsHomebrewResp getFormulaDetails(@PathVariable("FORMULA") String FORMULA);

}
