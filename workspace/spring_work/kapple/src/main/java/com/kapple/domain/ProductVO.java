package com.kapple.domain;

import lombok.Data;

@Data
public class ProductVO {
	private String prod_no;
	private String unit;
	private String prod_name;
	private String prod_detail;
	private ModelVO model;
}
