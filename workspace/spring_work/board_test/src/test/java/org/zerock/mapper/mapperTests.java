package org.zerock.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class mapperTests {

	@Autowired
	private BoardMapper mapper;
	
//	@Test
//	public void insertTest() {
//		BoardVO vo = new BoardVO();
//		vo.setTitle("123");
//		vo.setWriter("123");
//		vo.setContent("123");
//		mapper.insertBoard(vo);
//		
//	}
//	@Test
//	public void deleteTest() {
//		long bno = 3L;
//		mapper.deleteBoard(bno);
//	}
	@Test
	public void getListTest() {
		Criteria cri = new Criteria();
		mapper.getListWithPaging(cri).forEach(board -> log.info(board));
	}
//	@Test
//	public void updateTest() {
//		BoardVO vo = new BoardVO();
//		vo.setBno(2L);
//		vo.setTitle("update1");
//		vo.setContent("update1");
//		mapper.updateBoard(vo);
//	}
	
//	@Test
//	public void selectTest() {
//		mapper.selectBoard(2L);
//	}


}
