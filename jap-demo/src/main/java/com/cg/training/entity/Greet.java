package com.cg.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greet {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer greetId;
	
	private String greeting;
	public Greet() {}
	public Greet(String greeting) {
		super();
		//this.greetId = greetId;
		this.greeting = greeting;
	}
	
	public Greet(Integer greetId, String greeting) {
		super();
		this.greetId = greetId;
		this.greeting = greeting;
	}

	public Integer getGreetId() {
		return greetId;
	}

	public void setGreetId(Integer greetId) {
		this.greetId = greetId;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
	

}
