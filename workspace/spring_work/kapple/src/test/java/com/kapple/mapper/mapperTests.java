package com.kapple.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class mapperTests {

	@Autowired
	private MapperKW mapper;
//	@Test
//	public void test() {
//		log.info("test");
//		mapper.test();
//	}
	
//	@Test
//	public void test() {
//		log.info(mapper.supplierList("부품이름1"));
//	}
	
	@Test
	public void test() {
		log.info(mapper.componentDetail("부품이름3"));
	}

}
