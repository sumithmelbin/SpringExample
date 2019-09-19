package com.java.admin;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;

public class PharmacyDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/* Generate random registration code after Patient registration */
	public int randomNumber() {
		int min = 5000, max = 10000;
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	/* SAVE DATA TO DATABASE FROM HospitalPatientRegistarion.jsp */
	public int SaveHospitalPatient(HospitalPatientRegistration hotpat) {
		String sql = "insert into hospatreg(fname,lname,sname,sex,phnumber,address,city,state,zip,emmegcontact,email,doctor,reason,patient_id)values('"
				+ hotpat.getFirstname() + "' ,'" + hotpat.getLastname() + "','" + hotpat.getSpousename() + "','"
				+ hotpat.getSex() + "','" + hotpat.getPhonenumber() + "','" + hotpat.getAddress() + "','"
				+ hotpat.getCity() + "','" + hotpat.getState() + "','" + hotpat.getZip() + "','"
				+ hotpat.getEmgcontact() + "','" + hotpat.getEmail() + "','" + hotpat.getDoctor() + "','"
				+ hotpat.getReason() + "','" + hotpat.getPatientid() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM HospitalNurseAssesment.jsp */
	public int SavePersonDetails(PersonDetails psn) {
		String sql = "insert into persondet(addate,fname,lname,dob,ht,wt,relegion,nationality,pcontact,relation,pnumber,pl)values('"
				+ psn.getAdmndate() + "' ,'" + psn.getFname() + "','" + psn.getLname() + "','" + psn.getDob() + "','"
				+ psn.getHeight() + "','" + psn.getWeight() + "','" + psn.getReligion() + "','" + psn.getNationality()
				+ "','" + psn.getPcontact() + "','" + psn.getRelation() + "','" + psn.getPnumber() + "','"
				+ psn.getPlang() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM NurseAssessmentFirst.jsp */
	public int SaveEverhad(NurseEverhad nvd) {
		String sql = "insert into everhad(hp,hpcomment,ha,hacomment,cl,clcomment,db,dbcomment,hd,hdcomment,thyroid,tcomment,optional,monthyear,oporill,hosname)values('"
				+ nvd.getHighbp() + "' ,'" + nvd.getHcomment() + "','" + nvd.getHattack() + "','" + nvd.getHacomment()
				+ "','" + nvd.getCholestrol() + "','" + nvd.getClcomment() + "','" + nvd.getDiabetes() + "','"
				+ nvd.getDbcomment() + "','" + nvd.getHdisease() + "','" + nvd.getHdcomment() + "','" + nvd.getThyroid()
				+ "','" + nvd.getTcomment() + "','" + nvd.getOption() + "','" + nvd.getMyear() + "','" + nvd.getOporil()
				+ "','" + nvd.getHname() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM NurseAssessmentSecond.jsp */
	public int SaveNurseallergy(NurseAllergy nalg) {
		String sql = "insert into allergy(medication,medcomment,food,foodcomment,latex,latexcomment,other,othercomment,dsmoke,dsmokecomment,desmoke,descomment,dalcohol,dealcomment,ddrugs,drugcomment)values('"
				+ nalg.getMedication() + "' ,'" + nalg.getMedcomment() + "','" + nalg.getFood() + "','"
				+ nalg.getFoodcomment() + "','" + nalg.getLatex() + "','" + nalg.getLatexcomment() + "','"
				+ nalg.getOther() + "','" + nalg.getOthercomment() + "','" + nalg.getDsmoke() + "','"
				+ nalg.getDsmokecomment() + "','" + nalg.getDesmoke() + "','" + nalg.getDesmokecomment() + "','"
				+ nalg.getDalchahol() + "','" + nalg.getDalcomment() + "','" + nalg.getDrugs() + "','"
				+ nalg.getDrugcomment() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM UserRegistarion.jsp */
	public int SaveUser(UserRegistration user) {
		String sql = "insert into userreg(fname,lname,email,password)values('" + user.getFirstname() + "' ,'"
				+ user.getLastname() + "','" + user.getEmail() + "','" + user.getPassword() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM PatientRegistarion.jsp */
	public int SavePatient(PatientRegistration patientreg) {
		String sql = "insert into patreg(fname,lname,address,sex,dob,place,phnumber,email)values('"
				+ patientreg.getFirstname() + "' ,'" + patientreg.getLastname() + "','" + patientreg.getAddress()
				+ "','" + patientreg.getSex() + "','" + patientreg.getBod() + "','" + patientreg.getPlace() + "','"
				+ patientreg.getPhonenumber() + "','" + patientreg.getEmail() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM NurseAssessmentReason.jsp */
	public int SaveReason(NurseAssessmentreason nsn) {
		String sql = "insert into reason(q1,q2,q3,q4,q5,q6,q7)values('" + nsn.getQuestion1() + "' ,'"
				+ nsn.getQuestion2() + "','" + nsn.getQuestion3() + "','" + nsn.getQuestion4() + "','"
				+ nsn.getQuestion5() + "','" + nsn.getQuestion6() + "','" + nsn.getQuestion7() + "')";
		return template.update(sql);
	}

	/* SAVE DATA TO DATABASE FROM NurseMedication.jsp */
	public int SaveMedication(NurseMedication nm) {
		String sql = "insert into medication(dname,dose,ntaken,reason)values('" + nm.getDname() + "' ,'" + nm.getDose()
				+ "','" + nm.getNtaken() + "','" + nm.getReason() + "')";
		return template.update(sql);
	}

	public ForgotUserPassword getElementByemail(String email) {
		String sql = "SELECT * FROM userreg WHERE email=?";
		return template.queryForObject(sql, new Object[] { email },
				new BeanPropertyRowMapper<ForgotUserPassword>(ForgotUserPassword.class));
	}

	public List<ForgotUserPassword> geForgotUserPassword() {
		return template.query("select * from userreg", new RowMapper<ForgotUserPassword>() {
			public ForgotUserPassword mapRow(ResultSet rs, int row) throws SQLException {
				ForgotUserPassword forpass = new ForgotUserPassword();
				forpass.setPassword(rs.getString("password"));
				forpass.setEmail(rs.getString("email"));

				return forpass;
			}
		});
	}

	/* CHECK IN USERNAME AND PASSWORD */
	public boolean isValidUser(String name, String password) throws SQLException, DataAccessException {
		boolean retVal;
		try {
			String sql = "select count(*) from userreg where email=? and password=?";
			int count = template.queryForInt(sql, new Object[] { name, password });
			System.out.println("LOGIN COUNT=" + count);
			if (count == 1) {
				retVal = true;
			} else {
				retVal = false;
			}
		} catch (Exception e) {
			retVal = false;
		}
		return retVal;
	}

	/* CHECKING WHILE MAKING USER REGISTRATION FROM UserRegistration.jsp */
	public boolean isCheckUserRegistration(String email) throws SQLException, DataAccessException {
		boolean retVal;
		try {
			String sql = "select count(*) from userreg where email=?";
			int count = template.queryForInt(sql, new Object[] { email });
			System.out.println("user count=" + count);
			if (count == 1) {
				retVal = false;
			} else {
				retVal = true;
			}
		} catch (Exception e) {
			retVal = false;
		}
		return retVal;
	}

	/* CHECKING IN email FOR ACCESS PAASWORD from ForgotUserPassword,jsp */
	public boolean isCheckAccesspassword(String email) throws SQLException, DataAccessException {
		boolean retVal;
		try {
			String sql = "select count(*) from userreg where email=?";
			int count = template.queryForInt(sql, new Object[] { email });
			System.out.println("user count=" + count);
			if (count == 1) {
				retVal = true;
			} else {
				retVal = false;
			}
		} catch (Exception e) {
			retVal = false;
		}
		return retVal;
	}

	public static void main(String[] args) throws SQLException, DataAccessException {
		HospitalPatientRegistration h = new HospitalPatientRegistration();
		//System.out.println(h.randomNumber());

	}
}