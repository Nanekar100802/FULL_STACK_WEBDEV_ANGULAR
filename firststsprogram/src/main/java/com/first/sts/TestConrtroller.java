package com.first.sts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConrtroller {
	
	@Autowired
	StudentService studentService;
	
	
	
	@RequestMapping("/get/student")
	@ResponseBody
	public String hello() {
		return studentService.getName();
		
	}
	

}
