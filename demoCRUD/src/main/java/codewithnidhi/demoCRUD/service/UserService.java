package codewithnidhi.demoCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.UserRepo;
import codewithnidhi.demoCRUD.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private JWTService jwtService;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public User register(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	public void remove(int uid) {
		userRepo.deleteById(uid);
	}

	public String verify(User user) {
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getUsername());
		}
		return "fail";
	}
}
