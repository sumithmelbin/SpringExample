package com.java.admin;

import org.hibernate.validator.constraints.NotEmpty;

public class NurseAssessmentreason {
	@NotEmpty(message = "Answer the question1")
	private String question1;
	@NotEmpty(message = "Answer the question2")
	private String question2;
	@NotEmpty(message = "Answer the question3")
	private String question3;
	@NotEmpty(message = "Answer the question4")
	private String question4;
	@NotEmpty(message = "Answer the question5")
	private String question5;
	@NotEmpty(message = "Answer the question6")
	private String question6;
	@NotEmpty(message = "Answer the question7")
	private String question7;

	public NurseAssessmentreason() {
	}

	public NurseAssessmentreason(String question1, String question2, String question3, String question4,
			String question5, String question6, String question7) {
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
		this.question7 = question7;
	}

	public String getQuestion1() {
		return this.question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return this.question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return this.question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return this.question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return this.question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion6() {
		return this.question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	public String getQuestion7() {
		return this.question7;
	}

	public void setQuestion7(String question7) {
		this.question7 = question7;
	}
}
