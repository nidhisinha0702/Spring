package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","CodeWithNidhi");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding model data to view");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		int createdUserId = this.userService.createUser(user);
		model.addAttribute("msg", "User created with id "+createdUserId);
		return "success";
	}
	
	/*@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam(name = "email",required=false) String userEmail, 
			@RequestParam("userName") String userName, 
			@RequestParam("userPassword") String userPassword, Model model) {
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		
		System.out.println(user);
		//process
		model.addAttribute("user",user);
		
		return "success";
	}*/
}
