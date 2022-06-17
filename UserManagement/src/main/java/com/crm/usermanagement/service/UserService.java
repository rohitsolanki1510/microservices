package com.crm.usermanagement.service;

import java.util.List;
import java.util.Optional;

import com.crm.usermanagement.entity.User;
import com.crm.usermanagement.model.GetUserResponse;

public interface UserService {

public List<User> getUsers();
	
	public GetUserResponse getUser(String userId);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public String deleteUser(String userId);
	
}
