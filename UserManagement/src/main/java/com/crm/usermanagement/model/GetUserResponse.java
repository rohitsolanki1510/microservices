package com.crm.usermanagement.model;

import java.util.List;

public class GetUserResponse {
	
	private Integer userId;
	private String userName;
	private boolean isActive;
	private boolean isLocked;
	//private List<GetRoleResponse> roles;
	
	private GetRoleResponse role;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	/*
	 * public List<GetRoleResponse> getRoles() { return roles; } public void
	 * setRoles(List<GetRoleResponse> roles) { this.roles = roles; }
	 */
	public GetRoleResponse getRole() {
		return role;
	}
	public void setRole(GetRoleResponse role) {
		this.role = role;
	}
	
	

}
