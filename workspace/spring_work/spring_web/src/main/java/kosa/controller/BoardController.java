package kosa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;
import kosa.model.BoardDao;

@Controller
public class BoardController {
	@Autowired
	private BoardDao dao;
	@GetMapping("/board_insert")
	public String insertForm(@ModelAttribute("boardCommand") Board board) {
		System.out.println("get 호출");
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
	public String board_list() {
		return "list";
	}
}
