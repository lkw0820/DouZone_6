package com.kapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.RetailerVO;
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


}
