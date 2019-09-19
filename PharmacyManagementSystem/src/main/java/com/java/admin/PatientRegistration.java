package com.java.admin;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class PatientRegistration {
	@NotEmpty(message = "Error: Enter the firstname")
	private String firstname;
	@NotEmpty(message = "Error: Enter the lastname")
	private String lastname;
	@NotEmpty(message = "Error: Enter the address")
	private String address;
	@NotEmpty(message = "Error: Enter the sex")
	private String sex;
	@NotEmpty(message = "Error: Enter the place")
	private String place;
	@NotEmpty(message="Error: Please enter phone number")
	private String phonenumber;
	@NotEmpty(message = "Error: Enter the email")
	@Email(message = "Error: email should be valid")
	private String email;
	@NotEmpty(message = "Error: Enter the Date of birth")
	private String bod;

	public PatientRegistration() {
	}

	public PatientRegistration(String firstname, String lastname, String address, String sex, String place,
			String phonenumber, String email, String bod) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.sex = sex;
		this.place = place;
		this.phonenumber = phonenumber;
		this.email = email;
		this.bod = bod;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBod() {
		return this.bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
