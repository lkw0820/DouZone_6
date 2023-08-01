package com.kapple.service;

import java.util.List;

import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.RetailerVO;
import com.kapple.domain.SupplierDetailVO;
import com.kapple.domain.SupplierVO;

public interface ServiceKW {
	public List<SupplierVO> supplierListService(String compo_name);
	public SupplierDetailVO supplierDetail(String suppl_no);
	public int supplierCount(String compo_name);
	public ProposalVO getProposal(String compo_name, String suppl_no);
	public ComponentVO componentDetail(String compo_name);
	public List<RetailerVO> retailerList(String prod_name);
}
