package com.java.admin;

import java.util.Random;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class HospitalPatientRegistration {
	@NotEmpty(message = "Error: Please enter first name")
	private String firstname;
	@NotEmpty(message = "Error: Please enter last name")
	private String lastname;
	@NotEmpty(message = "Error: Please spouse name")
	private String spousename;
	@NotEmpty(message = "Error: Please enter sex")
	private String sex;
	@NotEmpty(message = "Error: Please enter phonenumber")
	private String phonenumber;
	@NotEmpty(message = "Error: Please enter address")
	private String address;
	@NotEmpty(message = "Error: Please enter city")
	private String city;
	@NotEmpty(message = "Error: Please enter state")
	private String state;
	@NotEmpty(message = "Error: Please enter zip")
	private String zip;
	@NotEmpty(message = "Error: Please enter emergency contact")
	private String emgcontact;
	@Email(message = "Please enter valid email")
	@NotEmpty(message = "Error: Please enter email")
	private String email;
	@NotEmpty(message = "Error: Please enter doctor name")
	private String doctor;
	@NotEmpty(message = "Error: Please enter reason")
	private String reason;
	private int patientid;

	public HospitalPatientRegistration() {
	}

	public HospitalPatientRegistration(String firstname, String lastname, String spousename, String sex,
			String phonenumber, String address, String city, String state, String zip, String emgcontact, String email,
			String doctor, String reason, int patientid) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.spousename = spousename;
		this.sex = sex;
		this.phonenumber = phonenumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.emgcontact = emgcontact;
		this.email = email;
		this.doctor = doctor;
		this.reason = reason;
		this.patientid = patientid;
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

	public String getSpousename() {
		return this.spousename;
	}

	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmgcontact() {
		return this.emgcontact;
	}

	public void setEmgcontact(String emgcontact) {
		this.emgcontact = emgcontact;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoctor() {
		return this.doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getPatientid() {
		int min = 5000, max = 10000;
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

}
