package com.crm.role.management.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private Integer roleID;
	
	@Column(name="role_name",nullable = false)
	private String roleName;
	
	@Column(name="created_date_time")
	private Date createdDateTime;
	
	@Column(name="last_updated_date_time")
	private Date updatedDateTeme;

	public Role() {
	}

	public Integer getRoleID() {
		return roleID;
	}

	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Date getUpdatedDateTeme() {
		return updatedDateTeme;
	}

	public void setUpdatedDateTeme(Date updatedDateTeme) {
		this.updatedDateTeme = updatedDateTeme;
	}

	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", roleName=" + roleName + ", createdDateTime=" + createdDateTime
				+ ", updatedDateTeme=" + updatedDateTeme + "]";
	}
	
	
}
