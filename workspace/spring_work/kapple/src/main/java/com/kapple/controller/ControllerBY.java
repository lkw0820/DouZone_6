package com.kapple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kapple.service.ServiceBY;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("")
public class ControllerBY {

	@Autowired
	private ServiceBY service;
}
