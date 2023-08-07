package com.kapple.mapper;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.SupplierVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class mapperTestsBY {

	@Autowired
	private MapperBY mapper;
	
//	@Test
//	public void getComponentListTest() {
//		log.info("getComponentList Test==========================");
//		mapper.getComponentList().forEach(component -> log.info(component));
//	}
	
	@Test
	public void insertSupplierTest() {
		log.info("insertSupplierTest Test==========================");
		
		SupplierVO supplier = new SupplierVO();
	
		supplier.setSuppl_name("공급사테스트1");
		supplier.setCeo_name("테스터1");
		supplier.setCategory("직영점1");
		supplier.setPhone("1111-11111");
		
		mapper.insertSupplier(supplier);
		
		log.info(supplier);
		
	}
	
//	@Test
//	public void insertProposalTest() {
//		log.info("insertProposalTest Test==========================");
//		
//		ProposalVO proposal = new ProposalVO();
//	    SupplierVO supplier = new SupplierVO();
//	    ComponentVO component = new ComponentVO(); 
//
//	    proposal.setProposal_no("PROP501");
//	    
//	    // 공급사 정보 설정
//	    supplier.setSuppl_no("SPPL10843"); // 실제 공급사의 고유 번호를 설정
//	    proposal.setSupplier(supplier);
//
//	    // 부품 정보 설정
//	    component.setCompo_no("CPNT10057"); // 실제 부품의 고유 번호를 설정
//	    proposal.setComponent(component);
//
//	    proposal.setPrice(1235L);
//	    proposal.setQuantity(1234L);
//	    proposal.setDefective_rate(0.123f);
//	    proposal.setQuality_grade("A");
//	    proposal.setProd_period("5");
//	    proposal.setProposal_date(new Date());
//
//	    mapper.insertProposal(proposal);
//	    log.info(proposal);
//		
//	}

	
}
