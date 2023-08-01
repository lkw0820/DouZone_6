package com.kapple.domain;

import lombok.Data;

@Data
public class SupplierDetailVO {
	private String suppl_name;
	private String ceo_name;
	private String category;
	private String phone;
	private String biz_no;
	private String transport_category;
	private Long transport_charge;
	private String transport_condition;
}
