package com.example.projeto1.entity;

import javax.persistence.*;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Role {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long id;
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
