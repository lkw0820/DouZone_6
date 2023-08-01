package com.kapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kapple.domain.ComponentVO;
import com.kapple.mapper.MapperBY;

@Service
public class ServiceBYImpl implements ServiceBY {

	
	@Autowired
	private MapperBY mapper;
	
	@Override
	public List<ComponentVO> getComponentList() {
		
		return mapper.getComponentList();
	}

}
