package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
