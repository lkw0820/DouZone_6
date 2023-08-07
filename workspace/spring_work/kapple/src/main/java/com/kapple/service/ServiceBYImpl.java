package com.kapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kapple.domain.ComponentVO;
import com.kapple.mapper.MapperBY;
import com.kapple.request.addSupplierRequest;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class ServiceBYImpl implements ServiceBY {

	
	@Autowired
	private MapperBY mapper;
	
	@Override
	public List<ComponentVO> getComponentList() {
		
		return mapper.getComponentList();
	}

	@Transactional
    @Override
	public void registerSupplierAndProposal(addSupplierRequest request) {
		try {
			mapper.insertSupplierWithSK(request.getSupplier()); // 첫 번째 INSERT
            // 첫 번째 INSERT 성공 후 새로 생성된 데이터를 받아온다.
            String newSupplierId = request.getSupplier().getSuppl_no();
            log.info("supple_no : " + newSupplierId);
            
        } catch (Exception e) {
            throw new RuntimeException("Transaction failed.", e);
        }
	}

	

}
