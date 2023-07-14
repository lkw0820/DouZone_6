package org.zerock.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardServiceTests;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"
})
@Log4j
public class BoardControllerTests {

	@Autowired
	private WebApplicationContext ctx; //spring container
	
	private MockMvc mockMvc;//가상의 mvc, 가상의 톰캣
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
//	@Test
//	public void testList() throws Exception{
//		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list"))
//				.andReturn().getModelAndView().getModelMap());
//	}
//	
//	@Test
//	public void testRegister() throws Exception{
//		log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/register")
//				.param("title","zxc")
//				.param("content","zxc")
//				.param("writer","zxc")
//				).andReturn().getModelAndView().getViewName());
//	}

//	@Test
//	public void testGet() throws Exception{
//		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/get")
//				.param("bno", "12"))
//				.andReturn()
//				.getModelAndView().getModelMap());
//	}
	
//	@Test
//	public void testRemove() throws Exception{
//		log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/remove")
//				.param("bno", "12")
//				).andReturn().getModelAndView().getViewName());
//	}
//	@Test
//	public void testModify() throws Exception{
//		log.info(mockMvc.perform(MockMvcRequestBuilders.post("/board/modify")
//				.param("bno", "9")
//				.param("title", "수정이용")
//				.param("content","update")
//				.param("writer", "lkw"))
//				.andReturn().getModelAndView().getViewName());
//	}
	@Test
	public void testList() throws Exception{
		log.info(mockMvc.perform(MockMvcRequestBuilders.get("/board/list")
				.param("pageNum", "2")
				.param("amount", "10"))
				.andReturn().getModelAndView().getModelMap());
	}

}
