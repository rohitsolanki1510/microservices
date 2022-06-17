package com.crm.role.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.role.management.model.Role;
import com.crm.role.management.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepoitory;
	
	public List<Role> getRoles() {
		return roleRepoitory.findAll();
	}

	public Role getRole(Integer roleId) {
		return roleRepoitory.getById(roleId);
	}

}
