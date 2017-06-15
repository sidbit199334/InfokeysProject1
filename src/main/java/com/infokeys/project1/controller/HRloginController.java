/*package com.infokeys.project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infokeys.project1.services.HRLoginService;



	@Controller
	public class HRloginController {

		@Autowired
		private HRLoginService hRLoginService;

		@RequestMapping("/HRlogindetails")
		public ModelAndView LoginDetails(@RequestParam(value = "username", required = true) String username,
				@RequestParam(value = "password", required = true) String password) {

			if (hRLoginService.loginChecks(username, password)) {
				String message = "you have succcesfully logged in";

				ModelAndView m = new ModelAndView("HRlogin");
				m.addObject("username", username);
				m.addObject("password", password);
				m.addObject("message", message);
				return m;
			} else {
				ModelAndView m = new ModelAndView("RegisterApplicant");
				return m;
			}

		}
	}

*/