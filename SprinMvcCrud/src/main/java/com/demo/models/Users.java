package com.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	private String username;
	private String password;
	private boolean active = true;
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<UsersRoles> roles =new ArrayList<>();;

	public Users() {		
	}

	public Users(String username, String password, boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;		
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<UsersRoles> getRoles() {
		return roles;
	}

	public void setRoles(List<UsersRoles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return username+password;

	}
}
