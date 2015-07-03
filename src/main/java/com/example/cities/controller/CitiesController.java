package com.example.cities.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/cities")
public class CitiesController {

	private static final Logger logger = LoggerFactory
			.getLogger(CitiesController.class);
	
    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return System.getenv("VERSION");
    }
    
	@RequestMapping(value = "/kill", method = RequestMethod.GET)
	public void kill() {
		logger.warn("*** The system is shutting down. ***");
		System.exit(0);
	}
}
