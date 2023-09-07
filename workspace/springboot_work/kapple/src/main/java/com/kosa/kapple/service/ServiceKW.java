package com.kosa.kapple.service;

import com.kosa.kapple.domain.ContractVO;
import com.kosa.kapple.domain.ProposalVO;
import com.kosa.kapple.domain.RetailerVO;
import com.kosa.kapple.domain.SupplierVO;

import java.util.List;

public interface ServiceKW {
    public List<SupplierVO> allSuppl(String compo_name);
    public ProposalVO getProposal(String compo_name,String suppl_no);
    public ProposalVO getProposaltoContract(String proposal_no);
    public ContractVO saveContract(ContractVO contract);
    public List<ContractVO> allContracts();
    public List<RetailerVO> retailerList(String prod_name);
}
