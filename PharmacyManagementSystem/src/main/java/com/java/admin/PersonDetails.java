package com.java.admin;

import org.hibernate.validator.constraints.NotEmpty;

public class PersonDetails {
	@NotEmpty(message = "Enter the admission date ")
	private String admndate;
	@NotEmpty(message = "Enter the firstname ")
	private String fname;
	@NotEmpty(message = "Enter the second name")
	private String lname;
	@NotEmpty(message = "Enter the date of birth")
	private String dob;
	@NotEmpty(message = "Enter the height")
	private String height;
	@NotEmpty(message = "Enter the weight")
	private String weight;
	@NotEmpty(message = "Enter the religion")
	private String religion;
	@NotEmpty(message = "Enter the nationnality")
	private String nationality;
	@NotEmpty(message = "Enter the person to be contacted")
	private String pcontact;
	@NotEmpty(message = "Enter the relation")
	private String relation;
	@NotEmpty(message = "Enter the phonenumber")
	private String pnumber;
	@NotEmpty(message = "Enter the language")
	private String plang;

	public PersonDetails() {
	}

	public PersonDetails(String admndate, String fname, String lname, String dob, String height, String weight,
			String religion, String nationality, String pcontact, String relation, String pnumber, String plang) {
		this.admndate = admndate;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.religion = religion;
		this.nationality = nationality;
		this.pcontact = pcontact;
		this.relation = relation;
		this.plang = plang;

	}

	public String getAdmndate() {
		return this.admndate;
	}

	public void setAdmndate(String admndate) {
		this.admndate = admndate;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPcontact() {
		return this.pcontact;
	}

	public void setPcontact(String pcontact) {
		this.pcontact = pcontact;
	}

	public String getRelation() {
		return this.relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPnumber() {
		return this.pnumber;
	}

	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}

	public String getPlang() {
		return this.plang;
	}

	public void setPlang(String plang) {
		this.plang = plang;
	}
}
