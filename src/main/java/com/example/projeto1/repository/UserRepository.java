package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.projeto1.entity.User;

//public interface UserRepository extends JpaRepository<User, Long>{
public interface UserRepository extends MongoRepository<User, Long>{

	User findByNameLike(String name);
	
	//@Query("select u from User u where u.name like %?1%")
	//User findByNameQualquerCoisa(String name);
	
	@Query("{ 'email' : ?0}")
	User findByEmailQualquerCoisa(String email);
	
	User findByEmailLike(String email);
	
	User findByNameLikeIgnoreCaseOrEmailLike(String name, String email);
	
}
