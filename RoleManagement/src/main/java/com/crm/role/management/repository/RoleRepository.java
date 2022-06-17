package com.crm.role.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.role.management.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
