package com.kapple.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PreAuthorize("isAuthenticated()")
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/*
	 * @GetMapping("/addSupplier") public void moveToAddSupplier() {
	 * log.info("move to AddSupplier Page.................................."); }
	 */
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/addRetailer")
	public void moveToAddRetailer() {
		log.info("move to addRetailer Page.....................................");
	}
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/comparsionSupplier")
	public void moveToComparsionSupplier() {
		log.info("move to ComparsionSupplier Page.....................................");
	}
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/comparsionRetailer")
	public void moveToComparsionRetailer() {
		log.info("move to ComparsionRetailer Page.....................................");
	}
	
//	@GetMapping("/statistics/overview")
//	public void moveToStatistics() {
//		log.info("move to Statistics Page.....................................");
//	}
//	
}
