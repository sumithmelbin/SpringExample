package com.java.admin;

import org.hibernate.validator.constraints.NotEmpty;

public class NurseEverhad {
	@NotEmpty(message = "Enter the Blood pressure")
	private String highbp;
	@NotEmpty(message = "Enter the Heart Attcak")
	private String hattack;
	@NotEmpty(message = "Enter the Cholestrol")
	private String cholestrol;
	@NotEmpty(message = "Enter the diabetes")
	private String diabetes;
	@NotEmpty(message = "Enter the Heart Disease")
	private String hdisease;
	@NotEmpty(message = "Enter the thyroid")
	private String thyroid;
	@NotEmpty(message = "Enter the hcomment")
	private String hcomment;
	@NotEmpty(message = "Enter the hacomment")
	private String hacomment;
	@NotEmpty(message = "Enter the clcomment")
	private String clcomment;
	@NotEmpty(message = "Enter the dbcomment")
	private String dbcomment;
	@NotEmpty(message = "Enter the hdcomment")
	private String hdcomment;
	@NotEmpty(message = "Enter the tcomment")
	private String tcomment;
	@NotEmpty(message = "Enter the month&year")
	private String myear;
	@NotEmpty(message = "Enter the Operation/ill")
	private String oporil;
	@NotEmpty(message = "Enter the hospital name")
	private String hname;
	@NotEmpty(message = "Enter the option")
	private String option;

	public NurseEverhad() {
	}

	public NurseEverhad(String highbp, String hattack, String cholestrol, String diabetes, String hdisease,
			String thyroid, String hcomment, String hacomment, String clcomment, String dbcomment, String hdcomment,
			String tcomment, String option, String myear, String oporil, String hname) {
		this.highbp = highbp;
		this.hattack = hattack;
		this.cholestrol = cholestrol;
		this.diabetes = diabetes;
		this.hdisease = hdisease;
		this.thyroid = thyroid;
		this.hcomment = hcomment;
		this.hacomment = hacomment;
		this.clcomment = clcomment;
		this.dbcomment = dbcomment;
		this.hdcomment = hdcomment;
		this.tcomment = tcomment;
		this.option = option;
		this.myear = myear;
		this.oporil = oporil;
		this.hname = hname;
	}

	public String getHighbp() {
		return this.highbp;
	}

	public void setHighbp(String highbp) {
		this.highbp = highbp;
	}

	public String getHattack() {
		return this.hattack;
	}

	public void setHattack(String hattack) {
		this.hattack = hattack;
	}

	public String getCholestrol() {
		return this.cholestrol;
	}

	public void setCholestrol(String cholestrol) {
		this.cholestrol = cholestrol;
	}

	public String getDiabetes() {
		return this.diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getHdisease() {
		return this.hdisease;
	}

	public void setHdisease(String hdisease) {
		this.hdisease = hdisease;
	}

	public String getThyroid() {
		return this.thyroid;
	}

	public void setThyroid(String thyroid) {
		this.thyroid = thyroid;
	}

	public String getHcomment() {
		return this.hcomment;
	}

	public void setHcomment(String hcomment) {
		this.hcomment = hcomment;
	}

	public String getHacomment() {
		return this.hacomment;
	}

	public void setHacomment(String hacomment) {
		this.hacomment = hacomment;
	}

	public String getClcomment() {
		return this.clcomment;
	}

	public void setClcomment(String clcomment) {
		this.clcomment = clcomment;
	}

	public String getDbcomment() {
		return this.dbcomment;
	}

	public void setDbcomment(String dbcomment) {
		this.dbcomment = dbcomment;
	}

	public String getHdcomment() {
		return this.hdcomment;
	}

	public void setHdcomment(String hdcomment) {
		this.hdcomment = hdcomment;
	}

	public String getTcomment() {
		return this.tcomment;
	}

	public void setTcomment(String tcomment) {
		this.tcomment = tcomment;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getMyear() {
		return this.myear;
	}

	public void setMyear(String myear) {
		this.myear = myear;
	}

	public String getOporil() {
		return this.oporil;
	}

	public void setOporil(String oporil) {
		this.oporil = oporil;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

}
