package com.example.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.projeto1.entity.User;
import com.example.projeto1.repository.UserRepository;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		List<User> users = userRepository.findAll();
		
		if (users.isEmpty()) {
		
			User user = new User();
			
			user.setEmail("aaa@aaa.com");
			user.setName("Teste");
			
			userRepository.save(user);
			
		}
		
		
	}

}
