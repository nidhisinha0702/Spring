package codewithnidhi.thymeleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import codewithnidhi.thymeleaf.model.UserForm;

@Controller
public class FormController {

	//handler method to handle user registration page request
	
	@GetMapping("/register")
	public String userRegistrationPage(Model model) {
		//Empty UserForm model object to store form data
		UserForm userForm = new UserForm();
		model.addAttribute("userForm",userForm);
		
		List<String> listProfession = Arrays.asList("Developer","Tester","Architect");
		model.addAttribute("listProfession",listProfession);
		return "register-form";
	}
	
	//handler method to handle user registration form submission request
	
	@PostMapping("/register/save")
	public String submitForm(Model model, @ModelAttribute("userForm") UserForm userForm) {
		model.addAttribute("userForm",userForm);
		return "register-success";
	}
}
