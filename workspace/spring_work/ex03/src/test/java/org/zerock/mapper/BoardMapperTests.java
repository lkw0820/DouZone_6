package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void test() {
//		mapper.getList().forEach(board->log.info(board));
//	}
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(2);
		cri.setAmount(10);
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board->log.info(board));
	}
//	@Test
//	public void test() {
//		BoardVO board = new BoardVO();
//		board.setTitle("2");
//		board.setContent("가자잇");
//		board.setWriter("이기원");
//		//mapper.insertBoard(board);
//		mapper.insertBoardSelectKey(board);
//		log.info(board);
//	}
//	@Test
//	public void test() {
//		log.info(mapper.selectBoard((long) 2));
//	}
//	@Test
//	public void test() {
//		BoardVO board1 = new BoardVO();
//		board1.setBno((long)4);
//		board1.setTitle("qwe1");
//		board1.setContent("qwe2");
//		board1.setWriter("qwe3");
//		log.info(mapper.updateBoard(board1));
//		mapper.getList().forEach(board->log.info(board));
//	}

}
