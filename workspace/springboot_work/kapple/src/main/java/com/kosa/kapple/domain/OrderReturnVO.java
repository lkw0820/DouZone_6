package com.kosa.kapple.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderReturnVO {
	private String order_return_no;
	private String order_no;
	private SupplierVO supplier;
	private ComponentVO component;
	private Long quantity;
	private Long price;
	private String remarks;
	private Date return_date;
}
