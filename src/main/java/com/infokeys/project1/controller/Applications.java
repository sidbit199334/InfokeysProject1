/*package com.infokeys.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infokeys.project1.model.Applicant;
import com.infokeys.project1.services.ApplicationsServices;

@Controller
public class Applications {
	@Autowired
	ApplicationsServices applicationsServices;

	@RequestMapping("/MGRloginDetails")
	public ModelAndView fetchRecords(@RequestParam(value = "jobid", required = false) int jobid) {

		ModelAndView m = new ModelAndView("");
		List<Applicant> list = applicationsServices.getAllDataById(jobid);
		for (Applicant applicant : list) {
			System.out.println(applicant);
m.addObject(list);
			m.addObject("jobid", jobid);
			m.addObject(applicant);
		}
		return null;

	}
}
*/