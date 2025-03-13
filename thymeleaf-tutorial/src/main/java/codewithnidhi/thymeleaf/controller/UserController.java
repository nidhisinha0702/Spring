package codewithnidhi.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

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
	
	//handler method to handle fragment expression
	
	@GetMapping("fragment-expression")
	public String fragmentExpression() {
		return "fragment-expression";
	}
	
	//handler method to handle thymeleaf each variable
	
	@GetMapping("/users")
	public String users(Model model) {
		User admin = new User("Admin","admin@gmail.com","ADMIN","Male");
		User ramesh = new User("Ramesh","ramesh@gmail.com","USER","Male");
		User meena = new User("Meena","meena@gmail.com","USER","Male");
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(ramesh);
		users.add(meena);
		model.addAttribute("users",users);
		return "users";
		}
	
	//handler method for if-unless
	
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		User admin = new User("Admin","admin@gmail.com","ADMIN","Male");
		User ramesh = new User("Ramesh","ramesh@gmail.com","USER","Male");
		User meena = new User("Meena","meena@gmail.com","USER","Male");
		List<User> users = new ArrayList<>();
		users.add(admin);
		users.add(ramesh);
		users.add(meena);
		model.addAttribute("users",users);
		return "if-unless";
	}
	
	@GetMapping("/switch-case")
	public String switchCase(Model model) {
		User user = new User("Nidhi","nk@gmail.com","USER","female");
		model.addAttribute("user",user);
		return "switch-case";
	}
	
}
