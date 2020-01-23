package com.mrityunjay.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.swagger.model.Student;

@RestController
public class UserController {

	@GetMapping("/get-user/{userId}")
	public String getUserNameById(@PathVariable Long userId) {
		System.out.println("userId=> "+ userId);
		return "Amit"+userId;
	}
	
	
	@GetMapping("/get-user")
	public Student getUserByName(@RequestParam("userName") String userName) {
		System.out.println("userName=> "+ userName);
		return new Student(10,userName,"Gaya","990000000","mr@gmail.com");
	}
}
