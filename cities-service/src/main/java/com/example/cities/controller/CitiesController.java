package com.example.cities.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/cities")
public class CitiesController {

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return System.getenv("VERSION");
    }
}
