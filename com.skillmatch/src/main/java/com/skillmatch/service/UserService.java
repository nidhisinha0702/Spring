package com.skillmatch.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.skillmatch.dto.RegisterRequest;
import com.skillmatch.entity.Skill;
import com.skillmatch.repository.SkillRepository;
import com.skillmatch.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final SkillRepository skillRepository;
	private final PasswordEncoder passwordEncoder;
	
	public void registerUser(RegisterRequest request) {
		//throw exception as user registered already
		if(userRepository.findByEmail(request.getEmail()).isPresent()) {
			throw new RuntimeException("User already exists");
		}
		
		//search by skillName and save to set
		Set<Skill> userSkills = new HashSet<>();
		if(request.getSkills() != null) {
			//checks if the skill already exist in the db if not, it creates a new skill record and save
			for(String skillName : request.getSkills()) {
				Skill skill = skillRepository.findByName(skillName).orElseGet(()-> skillRepository.save(new Skill(null, skillName)));
				userSkills.add(skill);
			}
		}
		
		User user = User.builder()
				.name(request.getName())
				.email(request.getEmail())
				.password(passwordEncoder.encode(request.getPassword()))
				.role(request.getRole())
				.skills(userSkills)
				.build();
		
		userRepository.save(user);
	}
}
