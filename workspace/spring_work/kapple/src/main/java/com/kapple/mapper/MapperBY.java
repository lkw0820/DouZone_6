package com.kapple.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kapple.domain.BizCertificateVO;
import com.kapple.domain.ComponentVO;
import com.kapple.domain.ProposalVO;
import com.kapple.domain.SupplDraftVO;
import com.kapple.domain.SupplFileVO;
import com.kapple.domain.SupplLogoVO;
import com.kapple.domain.SupplierVO;

public interface MapperBY {
	
	// 부품 리스트 가져오기 
	public List<ComponentVO> getComponentList();

	// 임시저장 리스트 가져오기 
	public List<SupplDraftVO> getSupplDraftList();
	
	// 공급사 리스트 가져오기
	public List<BizCertificateVO> getSupplInfoWithAddress();
		
	// 공급사 등록
	public int insertSupplier(SupplierVO supplier);
	
	// 공급사 등록 with Select Key
	public void insertSupplierWithSK(SupplierVO supplier);
	
	// 공급사 제안 등록 
	public int insertProposal(ProposalVO proposal);
	
	// 공급사 제안 등록 with Select Key
	public void  insertProposalWithSK(ProposalVO proposal);
	
	// 임시저장 등록
	public void insertDraft(SupplDraftVO supplDraft);
	
	// 공급사 로고 등록
	public void insertSupplLogo(SupplLogoVO supplLogo);

	// 공급사 파일 등록
	public void insertSupplFile(SupplFileVO supplFile);
	
	// 공급사 로고 업데이트
	public void updateSupplNoInLogo(@Param("suppl_no") String suppl_no, @Param("uuid")String uuid);
	
	// 공급사 파일 업데이트
	public void updateSupplNoInFile(@Param("suppl_no") String suppl_no, @Param("uuid")String uuid);
}
