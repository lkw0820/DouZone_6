package kosa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;
import kosa.model.BoardDao;
import kosa.model.Search;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;
	
	@GetMapping("/board_insert")
	public String insertForm(@ModelAttribute("boardCommand") Board board) {
		return "insert_form";
	}
	
	@PostMapping("/board_insert")
	public String board_insert(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
		if(errors.hasErrors()) {
			System.out.println("에러발생");
			return "insert_form";
		}
		dao.insertBoard(board);
		return "redirect:board_list";
	}
	
	@GetMapping("/board_list")
	public String board_list(Search search, Model model) {
		search.setSearchKey("%"+search.getSearchKey()+"%");
		model.addAttribute("list",dao.listBoard(search));
		return "list";
	}
	
	@GetMapping("/board_detail{seq}")
	public String board_detail(@PathVariable int seq, Model model) {
		model.addAttribute("board",dao.detailBoard(seq));
		return "detail";
	}
	
	@GetMapping("/board_delete")
	public String board_delete(@RequestParam("seq") int seq) {
		dao.deleteBoard(seq);
		return "redirect:board_list";
	}
	
	@GetMapping("/board_update")
	public String board_update(@ModelAttribute("boardCommand") Board board,@RequestParam("seq") int seq, Model model) {
		model.addAttribute("board",dao.detailBoard(seq));
		return "update_form";
	}
	
	@PostMapping("/board_update")
	public String board_update2(@ModelAttribute("boardCommand") @Valid Board board, BindingResult errors) {
		if(errors.hasErrors()) {
			System.out.println("에러발생");
			return "update_form";
		}
		dao.updateBoard(board);
		return "redirect:board_list";
	}

}
