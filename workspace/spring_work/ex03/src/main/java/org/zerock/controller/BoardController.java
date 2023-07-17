package org.zerock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	@GetMapping("/register")
	public void register() {}
	
	@GetMapping("/list")
	public void list(Criteria cri,Model model) {
		log.info("list");
		int total = service.getTotal(cri);
		model.addAttribute("list",service.getList(cri)); //해당하는 페이지에 있는 게시물 출력
		model.addAttribute("pageMaker",new PageDTO(cri, total)); //페이지 번호들 출력
	}
	
	@PostMapping("/register")
	public String register(BoardVO board ,RedirectAttributes rttr) {
		log.info("register....");
		service.register(board);
		rttr.addFlashAttribute("result",board.getBno());
		return "redirect:/board/list";
	}
	@GetMapping({"/get","/modify"})
	public void get(Model model, @RequestParam("bno") Long bno, @ModelAttribute("cri") Criteria cri) {
		log.info("get or modify");
		model.addAttribute("board", service.get(bno));
	}
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr, Criteria cri) {
		log.info("remove...");
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result","success");
		}
//		rttr.addAttribute("pageNum", cri.getPageNum());
//		rttr.addAttribute("amount",cri.getAmount());
//		rttr.addAttribute("type",cri.getType());
//		rttr.addAttribute("keyword",cri.getKeyword());
		return "redirect:/board/list"+cri.getListLink();
	}
	@PostMapping("/modify")
	public String modify(BoardVO board,RedirectAttributes rttr, Criteria cri) {
		log.info("modify....");
		
		if(service.modify(board)) {
			rttr.addFlashAttribute("result","success");
		}
//		rttr.addAttribute("pageNum", cri.getPageNum());
//		rttr.addAttribute("amount",cri.getAmount());
//		rttr.addAttribute("type",cri.getType());
//		rttr.addAttribute("keyword",cri.getKeyword()); 이거 대신 getListLink()사용

		return "redirect:/board/list"+cri.getListLink();
	}
}
