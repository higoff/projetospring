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
		
			createUser("Nataniel Paiva", "aaa@aaa.com");
			createUser("João", "bbb@bbb.com");
			createUser("Maria", "ccc@ccc.com");
			
		}
		
		//User user = userRepository.findByNameQualquerCoisa("Ma");
		//User user = userRepository.findByEmailLike("aaa@aaa.com");
		User user = userRepository.findByNameLikeIgnoreCaseOrEmailLike("nataniel%", "aaa");
		
		
		//user.setName("Nataniel Paiva");
		
		//userRepository.save(user);
		
		System.out.println(user.getName());
		
		//userRepository.deleteById(2L);
				
	}
	
	public void createUser (String name, String email) {
		
		User user = new User(name, email);
		
		userRepository.save(user);
		
	}

}
