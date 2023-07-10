package kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kosa.model.Board;

@Controller
public class BoardController {

	@GetMapping("/board_insert")
	public String insertForm() {
		System.out.println("get 호출");
		return "insert_form";
	}
	@PostMapping("/board_insert")
	public String board_insert(Board board) {
		System.out.println(board);
		System.out.println("post 호출");
		return "redirect:board_list";
	}
	@GetMapping("/board_list")
	public String board_list() {
		return "list";
	}
}
