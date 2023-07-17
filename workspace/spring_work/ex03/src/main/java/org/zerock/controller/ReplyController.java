package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

import lombok.extern.log4j.Log4j;
@RequestMapping("/replies/*")
@RestController
@Log4j

public class ReplyController {
	@Autowired
	private ReplyService service;
	
	@PostMapping("/new")
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		log.info("ReplyVO: "+vo);
		int insertCount = service.register(vo);
		log.info("insert count: "+insertCount);
		
		return insertCount==1?new ResponseEntity<String>("success",HttpStatus.OK)
				:new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("/pages/{bno}/{page}")
	public ResponseEntity<List<ReplyVO>> getList(
			@PathVariable("page") int page, @PathVariable("bno") Long bno){
		log.info("getList.........");
		Criteria cri = new Criteria(page,10);
		return new ResponseEntity<>(service.getList(cri, bno),HttpStatus.OK);
	}
	
	@GetMapping("/{rno}")
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno){
		log.info("getReply.....");
		return new ResponseEntity<ReplyVO>(service.get(rno),HttpStatus.OK);
	}
	
	@DeleteMapping("/{rno}")
	public ResponseEntity<String> delete(@PathVariable("rno") Long rno){
		log.info("delete....."+rno);
		int deleteCount = service.remov(rno);
		log.info("deleteCount: "+deleteCount);
		return deleteCount==1?new ResponseEntity<String>("success",HttpStatus.OK)
				:new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@PatchMapping("/{rno}")
	public ResponseEntity<String> update(@PathVariable("rno") Long rno,@RequestBody ReplyVO vo){
		log.info("rno:"+rno);
		vo.setRno(rno);
		log.info("modify: "+vo);
		return service.modify(vo)==1?new ResponseEntity<String>("success",HttpStatus.OK)
				:new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
