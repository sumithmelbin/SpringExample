package com.java.pharmacy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.admin.NurseAllergy;
import com.java.admin.NurseAssessmentreason;
import com.java.admin.NurseEverhad;
import com.java.admin.NurseHospital;
import com.java.admin.NurseMedication;
import com.java.admin.PersonDetails;
import com.java.admin.PharmacyDao;

@Controller
public class NurseAssessmentController {
	@Autowired
	PharmacyDao dao;

	@RequestMapping(value = "/HospitalNurseAssessment", method = RequestMethod.GET)
	public ModelAndView ShowForm() {
		return new ModelAndView("HospitalNurseAssessment", "command", new PersonDetails());

	}

	/* Create Model object for PersonDetails.java */
	@ModelAttribute("PersonDetails")
	public PersonDetails createPersonDetailsModel() {
		return new PersonDetails();
	}

	/* Create Model object for NurseHospital.java */
	@ModelAttribute("NurseHos")
	public NurseHospital createNurseHospitalModel() {
		return new NurseHospital();
	}
	/* Create Model object for NurseHospital.java */

	@ModelAttribute("Nursehad")
	public NurseEverhad createNurseEverhadModel() {
		return new NurseEverhad();
	}

	/* Create Model object for Nurseallergy.java */
	@ModelAttribute("Nurseallergy")
	public NurseAllergy createNurseAllergyModel() {
		return new NurseAllergy();
	}

	/* Create Model object for Nursereason.java */
	@ModelAttribute("Nursereason")
	public NurseAssessmentreason createNurseAssessmentreasonModel() {
		return new NurseAssessmentreason();
	}

	/* Create Model object for Nursereason.java */
	@ModelAttribute("Nursemedication")
	public NurseMedication createNurseMedicationModel() {
		return new NurseMedication();
	}

	/* Request Mapping for HospitalNurseAssessment.jsp */
	@RequestMapping("/HospitalNurseAssessment")
	public ModelAndView welcome() {
		ModelAndView modelandview = new ModelAndView("HospitalNurseAssessment");
		return modelandview;
	}

	/* Request Mapping for NurseAssessmentFirst.jsp */
	@RequestMapping("/NurseAssesmentFirstPage")
	public ModelAndView AssesmentFirstpage() {
		ModelAndView modelandview = new ModelAndView("NurseAssesmentFirstPage");
		return modelandview;
	}

	/* Request Mapping for NurseAssessmentSecond.jsp */
	@RequestMapping("/NurseAssessmentSecondPage")
	public ModelAndView AssessmenSecondpage() {
		ModelAndView modelandview = new ModelAndView("NurseAssessmentSecondPage");
		return modelandview;
	}

	/* Request Mapping for NurseAssessmentReason.jsp */
	@RequestMapping("/NurseAssessmentReason")
	public ModelAndView AssessmenReason() {
		ModelAndView modelandview = new ModelAndView("NurseAssessmentReason");
		return modelandview;
	}

	/* Request Mapping for NurseMedication.jsp */
	@RequestMapping("/NurseMedication")
	public ModelAndView medication() {
		ModelAndView modelandview = new ModelAndView("NurseMedication");
		return modelandview;
	}

	@ModelAttribute("optionList")
	public List<String> getOptionList() {
		List<String> list = new ArrayList<String>();
		list.add("YES");
		list.add("NO");
		return list;
	}

	/*
	 * Request Mapping for Data saving to database from HospitalNurseAssessment.jsp
	 */
	@RequestMapping(value = "/HospitalPerson", method = RequestMethod.POST)
	public ModelAndView HospitalPerson(@ModelAttribute("PersonDetails") @Validated PersonDetails PersonDetails,
			BindingResult bindingResult) {
		ModelAndView modelandview = null;
		System.out.println("Execution...");
		if (bindingResult.hasErrors()) {
			modelandview = new ModelAndView("HospitalNurseAssessment");
		} else {
			dao.SavePersonDetails(PersonDetails);
			modelandview = new ModelAndView("NurseAssessmentReason");
			modelandview.addObject("msg", "Person details registration successfull.....");
		}
		return modelandview;
	}
	/*
	 * Request Mapping for Data saving to database from NurseAssessmentFirstPage.jsp
	 */

	@RequestMapping(value = "/NurseAssesmentFirst", method = RequestMethod.POST)
	public ModelAndView nurseAssesmentFirst(@ModelAttribute("Nursehad") @Validated NurseEverhad Nursehad,
			BindingResult bindingResult) {
		ModelAndView modelandview = null;
		System.out.println("Execution...");
		if (bindingResult.hasErrors()) {
			modelandview = new ModelAndView("NurseAssesmentFirstPage");
		} else {
			dao.SaveEverhad(Nursehad);
			modelandview = new ModelAndView("viewresult");
			modelandview.addObject("msg", "...Person details registration successfull...");
		}
		return modelandview;
	}

	/*
	 * Request Mapping for Data saving to database from
	 * NurseAssessmentSecondPage.jsp
	 */
	@RequestMapping(value = "/NurseAssessmentSecond", method = RequestMethod.POST)
	public ModelAndView nurseAssesmentSecond(@ModelAttribute("Nurseallergy") @Validated NurseAllergy Nurseallergy,
			BindingResult bindingResult) {
		ModelAndView modelandview = null;
		System.out.println("Execution Second...");
		if (bindingResult.hasErrors()) {
			modelandview = new ModelAndView("NurseAssessmentSecondPage");
		} else {
			dao.SaveNurseallergy(Nurseallergy);
			modelandview = new ModelAndView("viewresult");
			modelandview.addObject("msg", "...registration successfull...");
		}
		return modelandview;
	}
	/*
	 * Request Mapping for Data saving to database from NurseAssessmentReason.jsp
	 */

	@RequestMapping(value = "/NurseAssessreason", method = RequestMethod.POST)
	public ModelAndView nurseAssesmentReason(
			@ModelAttribute("Nursereason") @Validated NurseAssessmentreason Nursereason, BindingResult bindingResult) {
		ModelAndView modelandview = null;
		System.out.println("Execution reason...");
		if (bindingResult.hasErrors()) {
			modelandview = new ModelAndView("NurseAssessmentReason");
		} else {
			dao.SaveReason(Nursereason);
			modelandview = new ModelAndView("NurseAssesmentFirstPage");
			modelandview.addObject("msg", "...registration successfull...");
		}
		return modelandview;
	}

	/*
	 * Request Mapping for Data saving to database from NurseMedication.jsp
	 */

	@RequestMapping(value = "/Nursemedicationdetails", method = RequestMethod.POST)
	public ModelAndView nurseMedication(@ModelAttribute("Nursemedication") @Validated NurseMedication Nursemedication,
			BindingResult bindingResult) {
		ModelAndView modelandview = null;
		System.out.println("Execution of medication...");
		if (bindingResult.hasErrors()) {
			modelandview = new ModelAndView("NurseMedication");
		} else {
			dao.SaveMedication(Nursemedication);
			modelandview = new ModelAndView("NurseMedication");
			modelandview.addObject("msg", "...registration successfull...");
		}
		return modelandview;
	}
}
