package com.kapple.mapper;

import java.util.Date;
import java.util.List;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.SupplierVO;

public interface MapperBY {
	
	// 부품 리스트 가져오기 
	public List<ComponentVO> getComponentList();
	
	// 공급사 등록
	public int insertSupplier(SupplierVO supplier);
	
	// 공급사 등록 with Select Key
	public int insertSupplierWithSK(SupplierVO supplier);
	
	// 공급사 제안 등록 
	public int insertProposal(ProposalVO proposal);
	
	// 공급사 제안 등록 with Select Key
	public int insertProposalWithSK(ProposalVO proposal);
}
