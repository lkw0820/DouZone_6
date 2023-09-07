package com.kosa.kapple.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersVO {
	private String order_no;
	private SupplierVO supplier;
	private ComponentVO component;
	private Long price;
	private Long quantity;
	private Date delivery_date;
	private Date order_date;
}
