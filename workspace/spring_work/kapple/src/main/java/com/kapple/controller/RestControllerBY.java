package com.kapple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kapple.request.addSupplierRequest;
import com.kapple.service.ServiceBY;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
@RequestMapping("/addSupplier")
public class RestControllerBY {

	@Autowired
	private ServiceBY service;
	
	@PostMapping("/register")
    public ResponseEntity<String> registerSupplierAndProposal(@RequestBody addSupplierRequest request) {
        try {
        	service.registerSupplierAndProposal(request);
            return new ResponseEntity<>("Success", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
