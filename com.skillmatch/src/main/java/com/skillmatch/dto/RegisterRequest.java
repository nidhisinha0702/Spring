package com.skillmatch.dto;

import java.util.Set;

import com.skillmatch.entity.Role;

import lombok.Data;

@Data
public class RegisterRequest {

	private String name;
	private String email;
	private String password;
	private Role role;
	private Set<String> skills;
}
