package codewithnidhi.demoCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import codewithnidhi.demoCRUD.Repository.UserRepo;
import codewithnidhi.demoCRUD.entity.User;
import codewithnidhi.demoCRUD.entity.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = repo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found"));
		
		return new UserPrincipal(user);
	}

}
