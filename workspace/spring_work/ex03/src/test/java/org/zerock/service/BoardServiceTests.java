package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapperTests;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Autowired
	private BoardService service;
	
//	@Test
//	public void test() {
//		BoardVO board = new BoardVO();
//		board.setTitle("3");
//		board.setContent("졸려");
//		board.setWriter("이기원");
//		service.register(board);
//		log.info(board);
//	}
//	@Test
//	public void test() {
//		log.info(service.get((long)8));
//	}
//	@Test
//	public void test() {
//		BoardVO board = new BoardVO();
//		board.setBno((long)5);
//		board.setTitle("3");
//		board.setContent("졸려");
//		board.setWriter("이기원");
//		service.register(board);
//		if(service.modify(board)) {
//			log.info("성공");
//		}else {
//			log.info("실패");
//		}
//	}
	@Test
	public void test() {
		if(service.remove((long)11)) {
			log.info("성공");
		}else {
			log.info("실패");
		}
	}

}
