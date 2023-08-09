package com.kapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kapple.domain.BizCertificateVO;
import com.kapple.domain.ComponentVO;
import com.kapple.domain.SupplDraftVO;
import com.kapple.domain.SupplFileVO;
import com.kapple.domain.SupplLogoVO;
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

	@Override
	public List<SupplDraftVO> getSupplDraftList() {
		
		return mapper.getSupplDraftList();
	}
	
	@Override
	public List<BizCertificateVO> getSupplInfoWithAddress() {
		
		return mapper.getSupplInfoWithAddress();
	}
	
	@Override
	@Transactional
    public void registerSupplierAndProposal(addSupplierRequest request) {
        try {
        	log.info("registerSupplierAndProposal service method called.");
        	//첫번째 작업 : 공급사 등록
            mapper.insertSupplierWithSK(request.getSupplier());
            
            request.getProposal().getSupplier().setSuppl_no(request.getSupplier().getSuppl_no());
            
            //두번째 작업 : 공급사 제안 등록
            mapper.insertProposalWithSK(request.getProposal());
            
            System.out.println(request.getLogo_uuid());
            System.out.println(request.getFile_uuid());
            
            if(!request.getLogo_uuid().isEmpty()) {
            	//세번째 작업: 공급사 로고 업데이트
            	mapper.updateSupplNoInLogo(request.getSupplier().getSuppl_no(), request.getLogo_uuid());
            }
            
            if(!request.getFile_uuid().isEmpty()) {
	            //네번째 작업: 공급사 파일 업데이트
	            mapper.updateSupplNoInFile(request.getSupplier().getSuppl_no(), request.getFile_uuid());
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Transaction failed.", e);
        }
    }

	@Override
	public void registerSupplDraft(SupplDraftVO request) {
		try {
        	log.info("registerSupplDraft service method called.");

            mapper.insertDraft(request);
        } catch (Exception e) {
            throw new RuntimeException("Transaction failed.", e);
        }
	}

	@Override
	public void registerSupplLogo(SupplLogoVO request) {
		mapper.insertSupplLogo(request);
	}

	@Override
	public void registerSupplFile(SupplFileVO request) {
		mapper.insertSupplFile(request);
	}


}
