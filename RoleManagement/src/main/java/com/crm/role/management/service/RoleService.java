package com.crm.role.management.service;

import java.util.List;


import com.crm.role.management.model.Role;

public interface RoleService {

	
	List<Role> getRoles();
	
	Role getRole(Integer roleId);
}
