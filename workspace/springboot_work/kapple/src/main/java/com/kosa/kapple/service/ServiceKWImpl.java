package com.kosa.kapple.service;

//import com.kosa.kapple.domain.ContractVO;
import com.kosa.kapple.domain.*;
import com.kosa.kapple.mapper.MapperKW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ServiceKWImpl implements ServiceKW{

    @Autowired
    private MapperKW mapper;
    @Override
    public List<SupplierVO> allSuppl(String compo_name) {
        return mapper.getAll(compo_name);
    }

    @Override
    public ProposalVO getProposal(String compo_name, String suppl_no) {
        return mapper.getProposal(compo_name,suppl_no);
    }

    @Override
    public ProposalVO getProposaltoContract(String proposal_no) {
        return mapper.getProposaltoContract(proposal_no);
    }



    @Override
    @Transactional
    public ContractVO saveContract(ContractVO contract) {
        int num=mapper.lastSEQ();
        contract.setContract_no("CTRT"+num);
        System.out.println(contract.getContract_no());
        mapper.saveContract(contract);
        String proposal_no=contract.getProposal_no();
        mapper.upProposalStat(proposal_no);
        return contract;
    }

    @Override
    public List<ContractVO> allContracts() {
        List<ContractVO> contracts=mapper.allContracts();

        for(ContractVO contract:contracts){
            contract.setContract_date(contract.getContract_date().substring(0,10));
            contract.setStart_date(contract.getStart_date().substring(0,10));
            contract.setEnd_date(contract.getEnd_date().substring(0,10));
        }
        return contracts;
    }

    @Override
    public List<RetailerVO> retailerList(String prod_name) {
        return mapper.retailerList(prod_name);
    }

    @Override
    public SalePredictVO2 getPredict(String prod_name, String retail_no) {
        return mapper.getPredict(prod_name,retail_no);
    }
}
