package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	StudentService studentService;
	
	
	
	@RequestMapping("/get/student")
	@ResponseBody
	public String hello() {
		return studentService.getName();
		
	}
	

}
