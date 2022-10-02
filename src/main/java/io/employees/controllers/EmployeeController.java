package io.employees.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("home")
	public String homeController() {
		return "home";
	}
}
