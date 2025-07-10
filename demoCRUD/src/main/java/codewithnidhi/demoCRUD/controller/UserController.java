package codewithnidhi.demoCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import codewithnidhi.demoCRUD.entity.User;
import codewithnidhi.demoCRUD.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        service.register(user);
        return "User registered successfully!";
    }
}
