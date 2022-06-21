package com.rk.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class UserRole {
	@Id
	private Integer rId;
	private String user;
	private String admin;
	private String superAdmin;

	public UserRole() {
		super();
	}

	public UserRole(Integer rId, String user, String admin, String superAdmin) {
		this.rId = rId;
		this.user = user;
		this.admin = admin;
		this.superAdmin = superAdmin;
	}

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(String superAdmin) {
		this.superAdmin = superAdmin;
	}

	@Override
	public String toString() {
		return "UserRole [rId=" + rId + ", user=" + user + ", admin=" + admin + ", superAdmin=" + superAdmin + "]";
	}

}
