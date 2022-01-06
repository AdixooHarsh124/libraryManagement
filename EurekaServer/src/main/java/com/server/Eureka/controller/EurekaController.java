package com.server.Eureka.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
	
	@RequestMapping("/server")
	public String home() 
	{
		return "eureka server home ";
	}

}  
