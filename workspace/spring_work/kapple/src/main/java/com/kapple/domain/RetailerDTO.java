package com.kapple.domain;

import java.util.List;

import lombok.Data;

@Data
public class RetailerDTO {

	private List<RetailerVO> rList;
	private String prod_name;
	private int count;
	private ProductVO prodDetail;
	
	public RetailerDTO(List<RetailerVO> rList, String prod_name, int count, ProductVO prodDetail) {
		super();
		this.rList = rList;
		this.prod_name = prod_name;
		this.count = count;
		this.prodDetail = prodDetail;
	}
}
