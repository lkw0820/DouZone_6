package com.kapple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kapple.service.ServiceMK;

import lombok.extern.log4j.Log4j;
	
@Controller
@Log4j
public class ControllerMK {
	
//	@Autowired
	private ServiceMK service;
	
	@GetMapping("/statistics")
	public String statistics() {
		log.info("statistics=================================");
		return "statistics-overview";
	}
	
	@GetMapping("/statistics-overview")
	public void overview() {
		log.info("overview=================================");
		
		
		
	}
	
	@GetMapping("/statistics-purchases")
	public void purchase() {
		log.info("purchase=================================");
		
		
		
	}
	
	@GetMapping("/statistics-sales")
	public void sales() {
		log.info("sales=================================");
		
		
		
	}
}
