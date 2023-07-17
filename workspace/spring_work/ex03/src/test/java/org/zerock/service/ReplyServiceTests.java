package org.zerock.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyServiceTests {
	
	@Autowired
	private ReplyService service;
	
//	@Test
//	public void test() {
//		log.info("insert test");
//		ReplyVO reply = new ReplyVO();
//		reply.setBno(4L);
//		reply.setReply("안녕하세요");
//		reply.setReplyer("이기원");
//		service.register(reply);
//	}
//	@Test
//	public void readTest() {
//		ReplyVO vo = service.get(11L);
//		log.info(vo);
//	}
//	@Test
//	public void updateTest() {
//		ReplyVO reply = new ReplyVO();
//		reply.setRno(11L);
//		reply.setReply("update");
//		service.modify(reply);
//	}
//	@Test
//	public void deleteTest() {
//		service.remov(7L);
//	}
	@Test
	public void listTest() {
		Criteria cri = new Criteria();
		List<ReplyVO> replies=service.getList(cri, 17L);
		replies.forEach(reply->log.info(replies));
	}
}
