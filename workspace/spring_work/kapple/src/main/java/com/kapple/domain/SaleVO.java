package com.kapple.domain;

import lombok.Data;

@Data
public class SaleVO {
	private String sale_no;
	private String retail_no;
	private String prod_no;
	private Long price;
	private Long quantity;
	private Long supply_amount;
	private Long vat_amount;
	private Long total_amount;
	private Long discount_rate;
}
