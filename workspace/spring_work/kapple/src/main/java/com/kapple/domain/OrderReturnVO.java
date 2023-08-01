package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class OrderReturnVO {
	private String order_return;
	private SupplierVO supplier;
	private ComponentVO component;
	private Long quantity;
	private Long price;
	private String remarks;
	private Date return_date;
}
