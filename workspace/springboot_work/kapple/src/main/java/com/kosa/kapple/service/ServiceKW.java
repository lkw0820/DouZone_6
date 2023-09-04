package com.kosa.kapple.service;

import com.kosa.kapple.domain.ProposalVO;
import com.kosa.kapple.domain.SupplierVO;

import java.util.List;

public interface ServiceKW {
    public List<SupplierVO> allSuppl(String compo_name);
    public ProposalVO getProposal(String compo_name,String suppl_no);
}
