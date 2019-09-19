package com.java.admin;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserRegistration {
	@NotEmpty(message = "Error: Please enter firstname")
	private String firstname;
	@NotEmpty(message = "Error: Please enter firstname")
	private String lastname;
	@Email(message = "Error: email should be valid")
	private String email;
	@NotEmpty(message = "Error: Please enter password")
	private String password;

	public UserRegistration() {

	}

	public UserRegistration(String firstname, String lastname, String email, String password) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
