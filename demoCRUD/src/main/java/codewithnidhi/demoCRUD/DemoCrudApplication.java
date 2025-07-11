package codewithnidhi.demoCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//username-user
//password-in the logs
@SpringBootApplication
public class DemoCrudApplication{
	
//	 	@Autowired
//	    private UserRepo userRepository;
//
//	    @Autowired
//	    private PasswordEncoder passwordEncoder;

	    public static void main(String[] args) {
	        SpringApplication.run(DemoCrudApplication.class, args);
	    }

//	    @Override
//	    public void run(String... args) {
//	        if (userRepository.findByUsername("nidhi").isEmpty()) {
//	            User user = new User();
//	            user.setUsername("nidhi");
//	            user.setPassword(passwordEncoder.encode("password123"));
//	            user.setRole("ROLE_USER");
//	            userRepository.save(user);
//	            System.out.println("Sample user 'nidhi' created.");
//	        }
//	    }
}
