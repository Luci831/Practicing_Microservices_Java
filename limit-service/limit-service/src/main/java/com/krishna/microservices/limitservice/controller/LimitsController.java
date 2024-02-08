package com.krishna.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.microservices.limitservice.bean.Limit;
import com.krishna.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limit retriveLimits()
	{
		return new Limit(config.getMinimum(),config.getMaximum());
//		return new Limit(1,100);
	}

}
