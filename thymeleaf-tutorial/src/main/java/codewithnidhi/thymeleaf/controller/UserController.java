package codewithnidhi.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import codewithnidhi.thymeleaf.model.User;

@Controller
public class UserController {

	//handler method to handle variable-expression request
	
	@GetMapping("variable-expression")
	public String variableExpression(Model model) {
		User user = new User("Nidhi","nk@gmail.com","engineer","female");
		model.addAttribute("user",user);
		return "variable-expression";
	}
	
	//handler method to handle selection expression
	//https://localhost:8080/selection-expression
	
	@GetMapping("/selection-expression")
	public String selectionExpression(Model model) {
		User user = new User("Akash","ak@gmail.com","engineer","male");
		model.addAttribute("user",user);
		return "selection-expression";
	}
	
	//handler method to handle message expression request
	
	@GetMapping("message-expression")
	public String messageExpression() {
		return "message-expression";
	}
	
	//handler method to handle link expressions
	//http://localhost:8080/link-expression
	
	@GetMapping("link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id",1);
		return "link-expression";
	}
}
