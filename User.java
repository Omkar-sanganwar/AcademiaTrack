package com.tka.sams.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private static final String first_Name = null;
	@Id
	private String username;
	private String password;
	private String firs_tName;
	private String last_Name;
	private String email;
	private String role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firs_tName;
	}

	public void setFirstName(String firstName) {
		this.firs_tName = firstName;
	}

	public String getLastName() {
		return last_Name;
	}

	public void setLastName(String lastName) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstName=" + first_Name  + ", lastName="
				+ last_Name + ", email=" + email + ", role=" + role + "]";
	}

}
