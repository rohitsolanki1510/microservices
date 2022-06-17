package com.crm.usermanagement.model;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;


@FeignClient(name="role-ws")
public interface GetRoleClient {
	
	@GetMapping("/role/{roleId}")
	//@Retry(name ="role-ws")
	@CircuitBreaker(name="role-ws",fallbackMethod="getRoleFallback")
	public GetRoleResponse getRole(@PathVariable("roleId") String roleId);
	
	default GetRoleResponse getRoleFallback(String roleId,Throwable exception) {
		System.out.println("Exception:"+exception.getMessage()); 
		
		return new GetRoleResponse();
	}

}
