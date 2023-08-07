package com.kapple.domain;

import java.util.List;

import lombok.Data;

@Data
public class SupplierDTO {
	private List<SupplierVO> sList;
	private String compo_name;
	private int count;
	private ComponentVO compoDetail;
	
	public SupplierDTO(List<SupplierVO> sList, String compo_name, int count, ComponentVO compoDetail) {
		super();
		this.sList = sList;
		this.compo_name = compo_name;
		this.count = count;
		this.compoDetail = compoDetail;
	}

}
