package com.kosa.kapple.mapper;

import com.kosa.kapple.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MapperKW {
    public List<ProposalVO> test();
    public List<SupplierVO> getAll(String compo_name);
    public ProposalVO getProposal(String compo_name, String suppl_no);
    public ProposalVO getProposaltoContract(String proposal_no);
    public int saveContract(ContractVO contract);
    public int upProposalStat(String proposal_no);
    public int lastSEQ();
    public List<ContractVO> allContracts();
    public List<RetailerVO> retailerList(String prod_name);
    public SalePredictVO2 getPredict(String prod_name, String retail_no);

}
