package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","Shivani");//setting data
		modelAndView.addObject("rollnumber",123414);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);//setting current time
		
		//marks
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(3456);
		list.add(2134);
		list.add(5268);
		list.add(158462);
		modelAndView.addObject("marks", list);
		modelAndView.setViewName("help");//setting view name
		return modelAndView;
	}
}
