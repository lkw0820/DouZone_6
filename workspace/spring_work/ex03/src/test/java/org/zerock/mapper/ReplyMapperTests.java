package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	@Autowired
	private ReplyMapper mapper;
	private Long[] bnoArr= {16L,17L,18L,19L,20L};
	@Test
	public void test() {
		log.info(mapper);
	}
	@Test
	public void InsertTest() {
		IntStream.range(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			vo.setBno(bnoArr[i%5]);
			vo.setReply("댓글 테스트 "+i);
			vo.setReplyer("replyer: "+i);
			
			mapper.insert(vo);
		});
	}
}
