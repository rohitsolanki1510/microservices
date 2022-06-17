package com.crm.usermanagement.service;

import com.crm.usermanagement.model.Response;

public interface UserLoginService {
	
	Response login(String username,String password);

}
