package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SaleVO {
	private String sale_no;
	private RetailerVO retailer;
	private ProductVO product;
	private Long price;
	private Long quantity;
	private Long supply_amount;
	private Long vat_amount;
	private Long total_amount;
	private Long discount_rate;
	private Date sale_date;
}
