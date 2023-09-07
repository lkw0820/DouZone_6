package com.kosa.kapple.service;

import com.kosa.kapple.domain.ComponentVO;
import com.kosa.kapple.mapper.MapperBY;
import com.kosa.kapple.vo.RequestComponent2;
import com.kosa.kapple.vo.RequestFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBYImpl implements ServiceBY{

    @Autowired
    private MapperBY mapper;


    @Override // 전체 부품 조회
    public List<ComponentVO> getAllComponents() {
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

}
