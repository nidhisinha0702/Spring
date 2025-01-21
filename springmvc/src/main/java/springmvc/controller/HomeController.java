package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(path="/home",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Nidhi Kumari");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services page");
		return "services";
	}
}
