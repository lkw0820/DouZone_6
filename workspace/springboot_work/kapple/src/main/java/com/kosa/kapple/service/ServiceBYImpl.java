package com.kosa.kapple.service;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.mapper.MapperBY;
import com.kosa.kapple.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBYImpl implements ServiceBY{

    @Autowired
    private MapperBY mapper;


    @Override // 전체 부품 조회
    public List<ResponseComponent2> getAllComponents() {
        return mapper.getAllComponents();
    }

    @Override
    public RequestComponent2 saveComponent(RequestComponent2 component) {
       mapper.saveComponent(component);
       return component;
    }

    @Override
    public RequestFile saveFile(RequestFile file) {
        mapper.saveFile(file);
        return file;
    }

    @Override
    public RequestFile updateFile(RequestFile file) {
        mapper.updateFile(file);
        return file;
    }

    @Override
    public RequestLogo saveLogo(RequestLogo logo) {
        mapper.saveLogo(logo);
        return logo;
    }

    @Override
    public RequestLogo updateLogo(RequestLogo logo) {
        mapper.updateLogo(logo);
        return logo;
    }

    @Override
    public RequestDraft saveDraft(RequestDraft draft) {
        mapper.saveDraft(draft);
        return draft;
    }

    @Override
    public List<ResponseDraft> getAllDrafts() {
        return mapper.getAllDrafts();
    }

    @Override
    public ResponseDraft getOneDraft(int draft_no) {
        ResponseDraft draft = mapper.getOneDraft(draft_no);
        return draft;
    }

    @Override
    public void deleteDraft(int draft_no) {
        mapper.deleteDraft(draft_no);
    }

    @Override
    public List<ResponseSupplier> getAllSuppliers2() {
        return mapper.getAllSuppliers2();
    }

    @Override
    public ResponseSupplier getOneSupplier2() {
        return null;
    }

}
