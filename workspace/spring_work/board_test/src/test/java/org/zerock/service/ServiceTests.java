package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.mapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class ServiceTests {

	@Autowired
	private BoardService service;
	
	@Test
	public void getListTest() {
		service.getList().forEach(board->log.info(board));
	}
//	
//	@Test
//	public void readTest() {
//		service.read(1L);
//	}
	
//	@Test
//	public void createTest() {
//		BoardVO vo = new BoardVO();
//		vo.setTitle("service2");
//		vo.setWriter("service2");
//		vo.setContent("service2");
//		service.create(vo);
//	}
	
//	@Test
//	public void modifyTest() {
//		BoardVO vo = new BoardVO();
//		vo.setBno(5L);
//		vo.setTitle("service update");
//		vo.setContent("service update");
//		service.modify(vo);
//	}
	
//	@Test
//	public void removeTest() {
//		service.read(6L);
//	}

}
