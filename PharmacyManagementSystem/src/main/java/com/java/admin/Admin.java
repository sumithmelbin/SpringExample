package com.java.admin;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Admin {
	@Email(message = "Error: email should be valid")
	@NotEmpty(message = "Error: Please enter the email or User ID")
	private String name;
	@NotEmpty(message = "Error: Enter the password")
	private String password;

	public Admin() {
	}

	public Admin(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public String getMode() { return this.mode; }
	 * 
	 * public void setMode(String mode) { this.mode = mode; }
	 */

}
