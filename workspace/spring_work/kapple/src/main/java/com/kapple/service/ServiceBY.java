package com.kapple.service;

import java.util.List;

import com.kapple.domain.BizCertificateVO;
import com.kapple.domain.ComponentVO;
import com.kapple.domain.SupplDraftVO;
import com.kapple.domain.SupplFileVO;
import com.kapple.domain.SupplLogoVO;
import com.kapple.request.addSupplierRequest;

public interface ServiceBY {
	public List<ComponentVO> getComponentList();
	
	public List<SupplDraftVO> getSupplDraftList();
	
	public List<BizCertificateVO> getSupplInfoWithAddress();
	
	public void registerSupplierAndProposal(addSupplierRequest request);
	
	public void registerSupplDraft(SupplDraftVO request);
	
	public void registerSupplLogo(SupplLogoVO request);

	public void registerSupplFile(SupplFileVO request);
}