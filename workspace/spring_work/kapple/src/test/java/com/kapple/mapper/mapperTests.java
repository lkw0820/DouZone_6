package com.kapple.mapper;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kapple.domain.EmpVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
	})
@Log4j
public class mapperTests {

	@Autowired
	private MapperKW mapper;
	@Autowired
	private PasswordEncoder pwencoder;
	@Autowired
	private DataSource ds;
//	@Test
//	public void test() {
//		log.info("test");
//		mapper.test();
//	}
	
//	@Test
//	public void test() {
//		log.info(mapper.supplierList("부품이름1"));
//	}
	
//	@Test
//	public void test() {
//		log.info(mapper.read("id184"));
//	}
//	@Test
//	public void updatePwTest() {
//		String sql= "update emp set pw=? where id=?";
//		String sql2="insert into authority values(?,?)";
//		String sql3 ="update emp set hiredate=sysdate where id=?";
//		
//		for(int i=194;i<284;i++) {
//			Connection con = null;
//			PreparedStatement pstmt = null;
//			try {
//				con = ds.getConnection();
//				pstmt = con.prepareStatement(sql3);
//				pstmt.setString(1, "id"+i);
//				//pstmt.setString(2, "ROLE_ADMIN");
//				pstmt.executeUpdate();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}finally {
//				if(pstmt !=null) {
//					try {
//						pstmt.close();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//				if(con !=null) {
//					try {
//						con.close();
//					} catch (Exception e2) {
//						// TODO: handle exception
//					}
//				}
//			}
//		}
//	}
//	@Test
//	public void updateEmpTest() {
//		EmpVO vo = new EmpVO();
//		vo.setAddress("update address");
//		vo.setEmail("update email");
//		vo.setPhone("update phone");
//		vo.setId("id200");
//		mapper.updateEmp(vo);
//	}
	@Test
	public void test() {
		mapper.productDetail("아이폰12미니");
	}

}
