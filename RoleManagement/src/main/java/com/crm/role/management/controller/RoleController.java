package com.crm.role.management.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.role.management.model.GetRoleResponse;
import com.crm.role.management.model.Role;
import com.crm.role.management.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	Logger logger;
	
	@GetMapping("/")
	public ResponseEntity<List<Role>> getRoles() {
		
		return new ResponseEntity<List<Role>> (roleService.getRoles(),HttpStatus.OK);
	}
	
		@GetMapping("/{roleId}")
		public ResponseEntity<GetRoleResponse> getRole(@PathVariable("roleId") String roleId) {
			logger.info("###getRole:"+roleId);
		
		Role role=roleService.getRole(Integer.valueOf(roleId));
		GetRoleResponse roleResponse = modelMapper.map(role, GetRoleResponse.class);
		return new ResponseEntity<GetRoleResponse> (roleResponse,HttpStatus.OK);
	}

}
