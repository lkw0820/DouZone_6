package com.kosa.kapple.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleReturnVO {
	private String sale_return_no;
	private RetailerVO retailer;
	private ProductVO product;
	private Long quantity;
	private Long price;
	private String remarks;
	private Date return_date;
}
