package com.java.pharmacy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.cfg.context.ReturnValueConstraintMappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.java.admin.Admin;
import com.java.admin.ForgotUserPassword;
import com.java.admin.PharmacyDao;
import com.java.admin.UserRegistration;
public class LoginController {
	@Autowired
	PharmacyDao dao;
	@Autowired
	private JavaMailSender mailSender;

	@RequestMapping(value = "/addAdmin", method = RequestMethod.GET)
	public ModelAndView admin() {
		return new ModelAndView("addAdmin", "command", new Admin());
	}

	@ModelAttribute("admin")
	public Admin createAdminModel() {
		return new Admin();
	}

	/* CREATE DROPDOWN LIST FROM addAdmin.jsp */
	@ModelAttribute("modeList")
	public List<String> getmodeList() {
		List<String> list = new ArrayList<String>();
		list.add("PHARMACY");
		list.add("DOCTOR");
		list.add("LAB");
		return list;

	}

	/*
	 * @RequestMapping(value = "/addAdmin", method = RequestMethod.GET) public
	 * ModelAndView userregistartion() { return new ModelAndView("addAdmin",
	 * "command", new UserRegistration()); }
	 */

	@ModelAttribute("user")
	public UserRegistration createUserRegistrationModel() {
		return new UserRegistration();
	}

	@ModelAttribute("userpass")
	public ForgotUserPassword createForgotUserPasswordModel() {
		return new ForgotUserPassword();
	}

	/* USER NAME AND PASSWORD CHECKING AND FORM VALIDATION WITH HIBERNATE */
	@RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
	public ModelAndView addAdmin(@RequestParam String name, @RequestParam String password,
			@ModelAttribute("admin") @Validated Admin admin, BindingResult bindingResult)
			throws SQLException, DataAccessException {
		boolean result;
		ModelAndView modelandView = null;
		if (bindingResult.hasErrors()) {
			modelandView = new ModelAndView("addAdmin");
		} else {

			name = admin.getName();
			password = admin.getPassword();
			if (name != null && password != null) {
				result = dao.isValidUser(name, password);
				if (result == true) {
					modelandView = new ModelAndView("Welcome");
					modelandView.addObject("msg", "LOGIN SUCCESS FULL");

				} else {
					modelandView = new ModelAndView("addAdmin");
					modelandView.addObject("msg", "! Invalid Email or password");
				}
			} else {
				modelandView = new ModelAndView("viewresult");
				modelandView.addObject("msg", "Error occured in login page");
			}
		}
		return modelandView;
	}

	/* REQUEST MAPPING FOR UserRegistration.jsp */
	@RequestMapping("/UserRegistration")
	public ModelAndView userRegistartion() {
		ModelAndView modelandview = new ModelAndView("UserRegistration");
		return modelandview;
	}

	/* REQUEST MAPPING FOR SAVE DATA FROM UserRegistartion.jsp */
	@RequestMapping(value = "/UserRegistartionSave", method = RequestMethod.POST)
	public ModelAndView UserSave(@RequestParam String email, @ModelAttribute("user") @Validated UserRegistration user,
			BindingResult bindresult) throws SQLException, DataAccessException {
		boolean result;
		ModelAndView modelandview = null;
		if (bindresult.hasErrors()) {
			modelandview = new ModelAndView("UserRegistration");
		} else {
			email = user.getEmail();
			if (email != null) {
				result = dao.isCheckUserRegistration(email);
				if (result == false) {

					modelandview = new ModelAndView("UserRegistration");
					modelandview.addObject("msg", "!* An account with this email already exists.");
				} else {
					dao.SaveUser(user);
					modelandview = new ModelAndView("viewresult");
					modelandview.addObject("msg", "Data Saved......");
				}
			} else {
				modelandview = new ModelAndView("viewresult");
				modelandview.addObject("msg", "Error occured in UserRegistration page");
			}

		}
		return modelandview;
	}

	/* REQUEST MAPPING FOR ForgotUserpassword.jsp */
	@RequestMapping(value = "/ForgotUserPassword")
	public ModelAndView forgotUserPass() {
		ModelAndView modelandview = new ModelAndView("ForgotUserPassword");
		return modelandview;

	}

	/*
	 * CHECKING IN EMAIL ACCOUNT AND TAKE THE PASSWORD FROM DATABASE SEND TO EMAIL
	 * FOR SECURITY
	 */
	@RequestMapping(value = "/SendEmail", method = RequestMethod.POST)
	public ModelAndView SendUsernamePassword(@RequestParam String email,
			@ModelAttribute("userpass") ForgotUserPassword userpass, BindingResult bindresult)
			throws SQLException, DataAccessException {
		boolean result;
		ModelAndView modelandview = null;
		if (bindresult.hasErrors()) {
			modelandview = new ModelAndView("ForgotUserPassword");
		} else {
			email = userpass.getEmail();// recipient address
			System.out.println(email);
			if (email != null) {
				result = dao.isCheckAccesspassword(email);
				if (result == true) {
					ForgotUserPassword foruserpass = dao.getElementByemail(email);
					SimpleMailMessage smessage = new SimpleMailMessage();
					smessage.setTo(email);
					// smessage.setText("USERACCOUNT: " + foruserpass.getEmail());//Access your user
					// account
					smessage.setText("PASSWORD:" + foruserpass.getPassword());// recepeint message(Access your password)
					mailSender.send(smessage);
					modelandview = new ModelAndView("ForgotUserPassword");
					modelandview.addObject("msg", "Check your email..");
				} else {
					modelandview = new ModelAndView("ForgotUserPassword");
					modelandview.addObject("msg", "E-mail not existing..");
				}
			} else {
				modelandview = new ModelAndView("viewresult");
				modelandview.addObject("msg", "Error occured in UserRegistration page");
			}
		}
		return modelandview;
	}

	public static void main(String[] args) {

	}
}