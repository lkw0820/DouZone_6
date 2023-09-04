package com.kosa.kapple.service;

import com.kosa.kapple.domain.ProposalVO;
import com.kosa.kapple.domain.SupplierVO;
import com.kosa.kapple.mapper.MapperKW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
