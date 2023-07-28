package com.kapple.domain;

import lombok.Data;

@Data
public class SalePredicVO {
	private String sale_prediect_no;
	private String retail_no;
	private String prod_no;
	private Long sales_amount;
	private String purchasing_grade;
	private Long price;
	private String transport_grade;
}
