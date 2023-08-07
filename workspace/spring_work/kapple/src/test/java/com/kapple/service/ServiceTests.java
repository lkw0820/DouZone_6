package com.kapple.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kapple.domain.EmpVO;
import com.kapple.mapper.mapperTests;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ServiceTests {

	@Autowired
	private ServiceKW service;
//	@Test
//	public void test() {
//		service.supplierListService("부품이름1").forEach(supplier -> log.info(supplier));
//	}
//	@Test
//	public void test() {
//		log.info(service.productDetail("고객사이름51"));
//	}
//	@Test
//	public void test() {
//		EmpVO vo = new EmpVO();
//		vo.setAddress("update address");
//		vo.setEmail("update email");
//		vo.setPhone("update phone");
//		vo.setId("id200");
//		if(service.updateEmp(vo)) {
//			log.info("successsdasdasdasdasdasdasdadasdasdasd");
//		}else {
//			log.info("fail");
//		}
//		
//	}
	@Test
	public void test() {
		service.productDetail("아이폰12미니");
	}
	

}
