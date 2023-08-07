package com.kapple.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kapple.domain.TestTblVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class mapperTestMK {
	
	@Autowired
	private MapperMK mapper;
	
	// VO를 @Data해놔서 bean등록은 안해도 되는데, 이게 Autowired로 안되고 꼭 직접 생성해야 하는 이유는...?
	private TestTblVO test = new TestTblVO();
	
	@Test
	public void testInsert() {
		test.setContents("test");
		test.setAnynum(123456);
		mapper.insert(test);
		log.info(test);
	}

}
