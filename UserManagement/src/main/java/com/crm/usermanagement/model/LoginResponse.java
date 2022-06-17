package com.crm.usermanagement.model;

public class LoginResponse {

	private String userName;
	
	//private String token;

	public LoginResponse() {
	}

	
	public LoginResponse(String userName) {
		this.userName = userName;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*
	 * public String getToken() { return token; }
	 * 
	 * public void setToken(String token) { this.token = token; }
	 */

	@Override
	public String toString() {
		return "LoginResponse [userName=" + userName /*+ ", token=" + token*/ + "]";
	}

}
