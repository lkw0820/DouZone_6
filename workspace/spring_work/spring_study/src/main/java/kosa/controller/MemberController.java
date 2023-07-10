package kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kosa.model.Member;
import kosa.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/registerAction")
	public String registerActionGet() {
		System.out.println("get 호출");
		return "registerForm";
	}
	@PostMapping("/registerAction")
	public String registerActionPost(Member m) {
		System.out.println("post 호출");
		service.Info(m);
		return "redirect:member_list";
	}
	@GetMapping("/member_list")
	public String member_list() {
		return "list";
	}
}
