package codewithnidhi.demoCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import codewithnidhi.demoCRUD.entity.User;
import codewithnidhi.demoCRUD.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setRole("ROLE_USER");
        service.register(user);
        return "User registered successfully!";
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
    	
    	return service.verify(user);
    }
    
    @DeleteMapping("/delete/{id}")
    public String remove(@PathVariable("id") int uid) {
    	service.remove(uid);
    	return "User deleted successfully";
    }
}
