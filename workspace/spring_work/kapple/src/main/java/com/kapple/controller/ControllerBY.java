package com.kapple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kapple.service.ServiceBY;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("")
public class ControllerBY {

	@Autowired
	private ServiceBY service;
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/addSupplier")
	public void moveToAddSupplier(Model model) {
		log.info("move to AddSupplier Page..................................");
		
		// 부품 리스트 불러오기 
		model.addAttribute("componentList",service.getComponentList());
	}
}
