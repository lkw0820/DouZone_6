package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SaleReturnVO {
	private String sale_return_no;
	private RetailerVO retailer;
	private ProductVO product;
	private Long quantity;
	private Long price;
	private String remarks;
	private Date return_date;
}
