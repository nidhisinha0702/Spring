package codewithnidhi.demoCRUD.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import codewithnidhi.demoCRUD.service.MyUserDetailsService;

@EnableWebSecurity
@Configuration
public class CustomSecurityConfig{
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	@Autowired
	private JwtFilter jwtFilter;

	    @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    	http
	        .csrf().disable()
	        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // important!
	        .and()
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/register", "/login").permitAll()
	            .anyRequest().authenticated()
	        )
	        .httpBasic(Customizer.withDefaults())
	    	.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	        return http.build();
	    }

	    @Bean
	    public AuthenticationManager authManager(HttpSecurity http, PasswordEncoder encoder)
	            throws Exception {
	        return http.getSharedObject(AuthenticationManagerBuilder.class)
	            .userDetailsService(userDetailsService)
	            .passwordEncoder(encoder)
	            .and()
	            .build();
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	    
	    @Bean
	    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
	    	return config.getAuthenticationManager();
	    }
}
