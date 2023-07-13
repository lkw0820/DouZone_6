package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@RequestMapping("")
	public void basic() {
		log.info("basic...........................");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto){
		log.info(""+dto);
		return "ex01";
	}
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age){
		log.info("이름:"+name);
		log.info("나이:"+age);
		return "ex01";
	}
	@GetMapping("/ex03")
	public String ex03(@RequestParam("ids") String[] ids){
		log.info("array ids: "+ Arrays.toString(ids));
		return "ex01";
	}
	
	@GetMapping("/ex04")
	public String home(Model model) {
		model.addAttribute("serverTime",new Date());
		return "home";
	}
	
	@GetMapping("/ex05")
	public String ex05(SampleDTO dto,@ModelAttribute("page") int page){
		log.info("dto: "+dto);
		log.info("page: "+page);
		return "ex04";
	}
	@GetMapping("/ex06")
	public void ex06() {
		log.info("ex06....");
	}
	@GetMapping("/ex07")
	public @ResponseBody SampleDTO ex07() { //json을 리턴
		log.info("ex07....");
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍");
		return dto;
	}
	
	@GetMapping("/ex08")
	public ResponseEntity<String> ex08(){
		log.info("ex08.....");
		
		//{"name":"홍길동"}
		String msg="{\"name\":\"홍길동\"}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		return new ResponseEntity<String>(msg,header,HttpStatus.OK);
	}
	@GetMapping("/exUpload")
	public void exUPload() {
		log.info("/exUpload");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file ->{
			log.info("---------------------");
			log.info("name : "+file.getOriginalFilename());
			log.info("size : "+file.getSize());
		});
	}
}
