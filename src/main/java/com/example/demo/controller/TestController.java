package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.dto.*;

@RestController
public class TestController {
	
	@GetMapping(value = "/test",produces = "application/json")
	public String getTest() throws JsonProcessingException {
		System.out.println("Controller getTest");
		ObjectMapper mapper = new ObjectMapper();
		Product p = new Product(1,"p1");
		return mapper.writeValueAsString(p);
		
	}

}
