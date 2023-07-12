package org.zerock.sample;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private TimeMapper timeMapper;
	private DataSource dataSource;
	
	@Test
	public void test() {
//		try {
//			log.info(dataSource.getConnection());
//		} catch (Exception e) {
//			fail(e.getMessage());
//		}
		
		log.info(timeMapper.getTime());
	}

}
