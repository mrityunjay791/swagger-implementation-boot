package com.mrityunjay.swagger.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.swagger.model.Student;

@RestController
public class HomeController {
	
	@GetMapping("/get-data")
	public Map<String, String> getData() {
		Map<String, String> map = new HashMap<>();
		map.put("id", "1");
		map.put("Name", "Mrityunjay");
		map.put("Address", "Patna");
		
		return map;
	}
	
	
	@GetMapping("/get-student-list")
	public List<Student> getStudentList() {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1,"Amit","Patna","99878777","am@gmail.com"));
		list.add(new Student(2,"Mrityunjay","Gaya","998787878","mk@gmail.com"));
		
		return list;
	}
}
