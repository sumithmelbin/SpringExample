package com.java.admin;

import org.hibernate.validator.constraints.NotEmpty;

public class NurseMedication {
	@NotEmpty(message = "Enter the Drug Name")
	private String dname;
	@NotEmpty(message = "Enter the Dose")
	private String dose;
	@NotEmpty(message = "Enter the ntaken")
	private String ntaken;
	@NotEmpty(message = "Enter the reason")
	private String reason;
	public NurseMedication() {
	}

	public NurseMedication(String dname, String dose, String ntaken, String reason) {
		this.dname = dname;
		this.dose = dose;
		this.ntaken = ntaken;
		this.reason = reason;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDose() {
		return this.dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getNtaken() {
		return this.ntaken;
	}

	public void setNtaken(String ntaken) {
		this.ntaken = ntaken;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
