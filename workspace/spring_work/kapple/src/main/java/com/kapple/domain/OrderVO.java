package com.kapple.domain;

import java.util.Date;

import lombok.Data;
@Data
public class OrderVO {
	private String order_no;
	private String suppl_no;
	private String compo_no;
	private Long price;
	private Long quantity;
	private Date delivery_date;
}
