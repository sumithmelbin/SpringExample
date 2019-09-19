package com.java.admin;

import org.hibernate.validator.constraints.NotEmpty;

public class NurseAllergy {
	@NotEmpty(message = "Enter the medication")
	private String medication;
	@NotEmpty(message = "Enter the food")
	private String food;
	@NotEmpty(message = "Enter the latex")
	private String latex;
	@NotEmpty(message = "Enter the other field")
	private String other;@NotEmpty(message = "Enter the medcomment")
	private String medcomment;
	@NotEmpty(message = "Enter the foodcomment")
	private String foodcomment;
	@NotEmpty(message = "Enter the latexcomment")
	private String latexcomment;
	@NotEmpty(message = "Enter the othercomment")
	private String othercomment;
	@NotEmpty(message = "Enter the general dsmoke field")
	private String dsmoke;
	@NotEmpty(message = "Enter the general desmoke field")
	private String desmoke;
	@NotEmpty(message = "Enter the general dalchahol field")
	private String dalchahol;
	@NotEmpty(message = "Enter the general durgs field")
	private String drugs;
	@NotEmpty(message = "Enter the dsmokecomment")
	private String dsmokecomment;
	@NotEmpty(message = "Enter the desmokecomment")
	private String desmokecomment;
	@NotEmpty(message = "Enter the dalcomment")
	private String dalcomment;
	@NotEmpty(message = "Enter the drugcomment")
	private String drugcomment;

	public NurseAllergy() {
	}

	public NurseAllergy(String medication, String food, String latex, String other, String medcommnet,
			String foodcomment, String latexcomment, String othercomment, String dsmoke, String desmoke,
			String dalchahol, String drugs, String dsmokecomment, String desmokecomment, String dalcomment,
			String drugcomment) {
		this.medication = medication;
		this.food = food;
		this.latex = latex;
		this.other = other;
		this.medcomment = medcommnet;
		this.foodcomment = foodcomment;
		this.latexcomment = latexcomment;
		this.othercomment = othercomment;
		this.dsmoke = dsmoke;
		this.desmoke = desmoke;
		this.dalchahol = dalchahol;
		this.drugs = drugs;
		this.dsmokecomment = dsmokecomment;
		this.desmokecomment = desmokecomment;
		this.dalcomment = dalcomment;
		this.drugcomment = drugcomment;

	}

	public String getMedication() {
		return this.medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getFood() {
		return this.food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLatex() {
		return this.latex;
	}

	public void setLatex(String latex) {
		this.latex = latex;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getMedcomment() {
		return this.medcomment;
	}

	public void setMedcomment(String medcomment) {
		this.medcomment = medcomment;
	}

	public String getFoodcomment() {
		return this.foodcomment;
	}

	public void setFoodcomment(String foodcomment) {
		this.foodcomment = foodcomment;
	}

	public String getLatexcomment() {
		return this.latexcomment;
	}

	public void setLatexcomment(String latexcomment) {
		this.latexcomment = latexcomment;
	}

	public String getOthercomment() {
		return this.othercomment;
	}

	public void setOthercomment(String othercomment) {
		this.othercomment = othercomment;
	}

	public String getDsmoke() {
		return this.dsmoke;
	}

	public void setDsmoke(String dsmoke) {
		this.dsmoke = dsmoke;
	}

	public String getDesmoke() {
		return this.desmoke;
	}

	public void setDesmoke(String desmoke) {
		this.desmoke = desmoke;
	}

	public String getDalchahol() {
		return this.dalchahol;
	}

	public void setDalchahol(String dalchahol) {
		this.dalchahol = dalchahol;
	}

	public String getDrugs() {
		return this.drugs;
	}

	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}

	public String getDsmokecomment() {
		return this.dsmokecomment;
	}

	public void setDsmokecomment(String dsmokecomment) {
		this.dsmokecomment = dsmokecomment;
	}

	public String getDesmokecomment() {
		return this.desmokecomment;
	}

	public void setDesmokecomment(String desmokecomment) {
		this.desmokecomment = desmokecomment;
	}

	public String getDalcomment() {
		return this.dalcomment;
	}

	public void setDalcomment(String dalcomment) {
		this.dalcomment = dalcomment;
	}

	public String getDrugcomment() {
		return this.drugcomment;
	}

	public void setDrugcomment(String drugcomment) {
		this.drugcomment = drugcomment;
	}
}
