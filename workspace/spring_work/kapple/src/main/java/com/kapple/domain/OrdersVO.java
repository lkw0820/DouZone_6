package com.kapple.domain;

import java.util.Date;

import lombok.Data;
@Data
public class OrdersVO {
	private String order_no;
	private SupplierVO supplier;
	private ComponentVO component;
	private Long price;
	private Long quantity;
	private Date delivery_date;
	private Date order_date;
}
