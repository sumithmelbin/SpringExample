package com.java.pharmacy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.admin.Admin;
import com.java.admin.PatientRegistration;
import com.java.admin.PharmacyDao;

@Controller
public class HospitaloginController {
	@Autowired
	PharmacyDao dao;

	@RequestMapping("/Login")
	public ModelAndView showform() {
		return new ModelAndView("Login", "command", new Admin());
	}

	@ModelAttribute("admin")
	public Admin createAdminModel() {
		return new Admin();
	}

	@RequestMapping("/Welcome1")
	public ModelAndView welcome() {
		ModelAndView modelandview = new ModelAndView("Welcome1");
		return modelandview;
	}

	@ModelAttribute("patientreg")
	public PatientRegistration createPatientRegistrationModel() {
		return new PatientRegistration();
	}

	/* CREATE DROPDOWN LIST FROM Welcome.jsp */
	@ModelAttribute("sexList")
	public List<String> getsexList() {
		List<String> list = new ArrayList<String>();
		list.add("Male");
		list.add("Female");
		return list;

	}

	/* USER NAME AND PASSWORD CHECKING AND FORM VALIDATION WITH HIBERNATE */
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView addLogin(@RequestParam String name, @RequestParam String password,
			@ModelAttribute("admin") @Validated Admin admin, BindingResult bindingResult)
			throws SQLException, DataAccessException {
		boolean result;
		ModelAndView modelandView = null;
		if (bindingResult.hasErrors()) {
			modelandView = new ModelAndView("Login");
		} else {

			name = admin.getName();
			password = admin.getPassword();
			if (name != null && password != null) {
				result = dao.isValidUser(name, password);
				if (result == true) {
					modelandView = new ModelAndView("Welcome");
					modelandView.addObject("msg","Hi Welcome");

				} else {
					modelandView = new ModelAndView("Login");
					modelandView.addObject("msg", "! Invalid Email or password");
				}
			} else {
				modelandView = new ModelAndView("viewresult");
				modelandView.addObject("msg", "Error occured in login page");
			}
		}
		return modelandView;
	}

	@RequestMapping("/PatientRegistration")
	public ModelAndView patientregistration() {
		ModelAndView modelandview = new ModelAndView("PatientRegistration");
		return modelandview;
	}

	/* REQUEST MAPPING FOR SAVE DATA FROM PatientRegistartion.jsp */
	@RequestMapping(value = "/PatientRegistrationSave", method = RequestMethod.POST)
	public ModelAndView PatientSave(@ModelAttribute("patientreg") @Validated PatientRegistration patientreg,
			BindingResult bindingresult) {
		System.out.println("mapping");
		ModelAndView modelandview = null;
		if (bindingresult.hasErrors()) {
			modelandview = new ModelAndView("PatientRegistration");
		} else {
			dao.SavePatient(patientreg);
			modelandview = new ModelAndView("PatientRegistration");
			modelandview.addObject("msg", "Registartion Successfull....");
		}
		return modelandview;

	}

	public static void main(String[] args) {
		HospitaloginController hs = new HospitaloginController();
		System.out.println("mapping");

	}
}
