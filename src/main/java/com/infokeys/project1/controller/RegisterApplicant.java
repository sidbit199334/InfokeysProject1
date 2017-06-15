package com.infokeys.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infokeys.project1.services.ApplicantServices;

import oracle.sql.BLOB;

@Controller
public class RegisterApplicant {

	@Autowired
	ApplicantServices applicantServices;

	/*
	 * @RequestMapping("/register") public ModelAndView render() { ModelAndView
	 * m = new ModelAndView("RegisterApplicant"); return m; }
	 */
	@RequestMapping("/register")
	public ModelAndView insertInfo(@RequestParam(value = "firstname", required = false) String firstname,
			@RequestParam(value = "lastname", required = false) String lastname,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "phone", required = false) Integer phone,
			@RequestParam(value = "jobid", required = false) Integer jobid,
			@RequestParam(value = "resumee", required = false) String resumee) {

		int result = applicantServices.registerApplicant(firstname, lastname, email, phone, jobid, resumee);
		if (result > 0) {
			ModelAndView m = new ModelAndView("Registered");
			String message = "succesfully uploaded your profile ";
			m.addObject("msg", message);

			return m;

		} else {
			ModelAndView m = new ModelAndView("RegisterApplicant");
			return m;
		}
	}
}
