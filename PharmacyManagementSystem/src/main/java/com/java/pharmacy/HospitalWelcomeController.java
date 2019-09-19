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
import com.java.admin.HospitalPatientRegistration;
import com.java.admin.PharmacyDao;

@Controller
public class HospitalWelcomeController {
	@Autowired
	PharmacyDao dao;

	@RequestMapping(value = "/HospitalHome", method = RequestMethod.GET)
	public ModelAndView ShowForm() {
		return new ModelAndView("HospitalHome", "command", new Admin());

	}

	@ModelAttribute("admin")
	public Admin createAdminModel() {
		return new Admin();
	}

	@ModelAttribute("hopat")
	public HospitalPatientRegistration createHospitalPatientRegistrationModel() {
		return new HospitalPatientRegistration();
	}

	@RequestMapping("/index")
	public ModelAndView welcome() {
		ModelAndView modelandview = new ModelAndView("index");
		return modelandview;
	}

	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView modelandview = new ModelAndView("test");
		return modelandview;
	}

	@RequestMapping("/test2")
	public ModelAndView test2() {
		ModelAndView modelandview = new ModelAndView("test2");
		return modelandview;
	}

	@RequestMapping("/Welcome")
	public ModelAndView welcomeLogin() {
		ModelAndView modelandview = new ModelAndView("Welcome");
		return modelandview;
	}

	@RequestMapping("/HospitalLogin")
	public ModelAndView Test() {
		ModelAndView modelandview = new ModelAndView("HospitalLogin");
		return modelandview;
	}

	@RequestMapping("/HospitalPatientRegistration")
	public ModelAndView hospitalpatient() {
		ModelAndView modelview = new ModelAndView("HospitalPatientRegistration");
		return modelview;
	}

	@ModelAttribute("sexList")
	public List<String> getsexList() {
		List<String> list = new ArrayList<String>();
		list.add("Male");
		list.add("Female");
		return list;
	}

	@RequestMapping(value = "/HospitalPatient", method = RequestMethod.POST)
	public ModelAndView hospitalPatient(@ModelAttribute("hopat") @Validated HospitalPatientRegistration hopat,
			BindingResult bindingResult) {
		ModelAndView modelview = null;
		if (bindingResult.hasErrors()) {
			modelview = new ModelAndView("HospitalPatientRegistration");
			System.out.println("Error fill out all fields..");
		} else {
			dao.SaveHospitalPatient(hopat);
			modelview = new ModelAndView("viewresult");
			modelview.addObject("ms", "Patient registration successfull...");
			/*modelview.addObject("msg", hopat.randomNumber());
			System.out.println(hopat.randomNumber());*/
		}
		return modelview;
	}

	/* USER NAME AND PASSWORD CHECKING AND FORM VALIDATION WITH HIBERNATE */
	@RequestMapping(value = "/HospitalLoginCheck", method = RequestMethod.POST)
	public ModelAndView hospitalLoginCheck(@RequestParam String name, @RequestParam String password,
			@ModelAttribute("admin") @Validated Admin admin, BindingResult bindingResult)
			throws SQLException, DataAccessException {
		boolean result;
		ModelAndView modelandView = null;
		if (bindingResult.hasErrors()) {
			modelandView = new ModelAndView("HospitalLogin");
		} else {

			name = admin.getName();
			password = admin.getPassword();
			if (name != null && password != null) {
				result = dao.isValidUser(name, password);
				if (result == true) {
					modelandView = new ModelAndView("Welcome");
					modelandView.addObject("msg", "Welcome" + "\t" + admin.getName());

				} else {
					modelandView = new ModelAndView("HospitalLogin");
					modelandView.addObject("msg", "! Invalid Email or password");
				}
			} else {
				modelandView = new ModelAndView("viewresult");
				modelandView.addObject("msg", "Error occured in login page");
			}
		}
		return modelandView;
	}

	public static void main(String[] args) {

	}
}
