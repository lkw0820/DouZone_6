package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model, Criteria cri) {
		log.info("list............");
		//Criteria cri = new Criteria();
		int total = service.getTotalCnt();
		//PageDTO dto=new PageDTO(cri,total);
		//log.info(dto.)
		model.addAttribute("list",service.getList(cri));
		model.addAttribute("pageMaker",new PageDTO(cri,total));
	}
	
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("bno") Long bno, Model model){
		BoardVO vo = service.read(bno);
		model.addAttribute("board",vo);
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno) {
		service.remove(bno);
		return "redirect:/board/list";
	}
	
	@PostMapping("/modify")
	public String modify(@ModelAttribute("board") BoardVO vo) {
		log.info(vo);
		service.modify(vo);
		return "redirect:/board/list";
	}
	
	@GetMapping("/register")
	public void registerGet() {
		log.info("register........");
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute("board") BoardVO vo) {
		log.info("등록 완료");
		service.register(vo);
		return "redirect:/board/list";
	}

}
