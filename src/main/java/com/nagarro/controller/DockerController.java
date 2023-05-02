package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	
	@GetMapping("/all")
	public String getAllData() {
		return "yeah Docker is working!!!! with jenkins";
	}

}
