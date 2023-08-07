package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SalePredictVO {
	private String sale_predict_no;
	private RetailerVO retailer;
	private ProductVO product;
	private Long sales_amount;
	private String purchasing_grade;
	private Long price;
	private String transport_grade;
	private Date predict_date;
}
