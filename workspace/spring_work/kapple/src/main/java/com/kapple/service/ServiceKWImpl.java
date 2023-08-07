package com.kapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.EmpVO;
import com.kapple.domain.ProductVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.RetailerDetailVO;
import com.kapple.domain.RetailerVO;
import com.kapple.domain.SalePredictVO;
import com.kapple.domain.SupplierDetailVO;
import com.kapple.domain.SupplierVO;
import com.kapple.mapper.MapperKW;

@Service
public class ServiceKWImpl implements ServiceKW {

	@Autowired
	private MapperKW mapper;
	
	@Override
	public List<SupplierVO> supplierListService(String compo_name) {
		//공급사 리스트 출력
		return mapper.supplierList(compo_name);
	}
	@Override
	public SupplierDetailVO supplierDetail(String suppl_no) {
		// 공급사 상세 정보 출력
		return mapper.supplierDetail(suppl_no);
	}
	@Override
	public int supplierCount(String compo_name) {
		// 공급사 개수
		return mapper.supplierCnt(compo_name);
	}
	@Override
	public ProposalVO getProposal(String compo_name, String suppl_no) {
		// 상품과 공급사에 해당하는 제안 출력
		return mapper.getProposal(compo_name, suppl_no);
	}
	@Override
	public ComponentVO componentDetail(String compo_name) {
		// 부품상세 정보
		return mapper.componentDetail(compo_name);
	}
	@Override
	public List<RetailerVO> retailerList(String prod_name) {
		// 판매사 리스트 출력
		return mapper.retailerList(prod_name);
	}
	@Override
	public int retailerCount(String prod_name) {
		// 판매사 개수
		return mapper.retailerCnt(prod_name);
	}
	@Override
	public RetailerDetailVO retailerDetail(String retail_no) {
		// 판매사 상세 정보
		return mapper.retailerDetail(retail_no);
	}
	@Override
	public ProductVO productDetail(String prod_name) {
		// 상품 상세 정보
		return mapper.productDetail(prod_name);
	}
	@Override
	public SalePredictVO getPredict(String prod_name, String retail_no) {
		// 상품과 판매사에 해당하는 판매 예측 출력
		return mapper.getPredict(prod_name, retail_no);
	}
	@Override
	public EmpVO read(String id) {
		// emp정보 출력
		return mapper.read(id);
	}
	@Override
	public boolean updateEmp(EmpVO vo) {
		// emp 정보 업데이트
		return mapper.updateEmp(vo)==1?true:false;
	}



}
