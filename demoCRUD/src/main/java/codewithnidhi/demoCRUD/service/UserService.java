package codewithnidhi.demoCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.UserRepo;
import codewithnidhi.demoCRUD.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public User register(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	public void remove(int uid) {
		userRepo.deleteById(uid);
	}
}
