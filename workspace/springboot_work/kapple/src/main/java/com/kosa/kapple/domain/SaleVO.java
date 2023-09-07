package com.kosa.kapple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleVO {
	private String sale_no;
	private RetailerVO retailer;
	private ProductVO product;
	private Long price;
	private Long quantity;
	private Long supply_amount; //컬럼명 suppl_amount
	private Long vat_amount;
	private Long total_amount;
	private Long discount_rate;
	private Date sale_date;
}
