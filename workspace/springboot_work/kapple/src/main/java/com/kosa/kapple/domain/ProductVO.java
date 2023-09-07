package com.kosa.kapple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {
	private String prod_no;
	private String unit;
	private String prod_name;
	private String prod_detail;
	//private ModelVO model;
}
