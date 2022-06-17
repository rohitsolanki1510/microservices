package com.crm.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.usermanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByuserNameAndPassword(String username,String password);

}
