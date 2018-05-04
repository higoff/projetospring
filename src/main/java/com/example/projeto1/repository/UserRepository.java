package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByNameLike(String name);
	
	@Query("select u from User u where u.name like %?1%")
	User findByNameQualquerCoisa(String name);
	
	User findByEmailLike(String email);
	
	User findByNameLikeIgnoreCaseOrEmailLike(String name, String email);
	
}
