package com.crm.usermanagement.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="dummyExternal",url = "${dummy.api.uri}")
public interface ExternalClient {
	
	@GetMapping("/todos/{id}")
	public ExternalClientModel getDummyResponse(@PathVariable("id") String id);
	

}
