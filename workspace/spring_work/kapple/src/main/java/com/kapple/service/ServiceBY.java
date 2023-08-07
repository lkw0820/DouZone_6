package com.kapple.service;

import java.util.List;

import com.kapple.domain.ComponentVO;
import com.kapple.request.addSupplierRequest;

public interface ServiceBY {
	public List<ComponentVO> getComponentList();
	
	public void registerSupplierAndProposal(addSupplierRequest request);
}
