package kosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService hservice;
	
	@RequestMapping("/hello.do")//default annotation handler mapping
	public ModelAndView hello() {
		System.out.println("호출");
		//controller
		//비즈니스 호출
		String str=hservice.getMessage();
		//호출의 결과값을 받는다
		//어떤 뷰로 갈지 뷰 결정
		ModelAndView mav = new ModelAndView();
		mav.addObject("message",str);
		mav.setViewName("hello");
		return mav;
	}
}
