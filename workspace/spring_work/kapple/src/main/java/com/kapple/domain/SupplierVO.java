package com.kapple.domain;

import lombok.Data;

@Data
public class SupplierVO {
	private String suppl_no;
	private TransportationVO transport;
	private String suppl_name;
	private String ceo_name;
	private String category;
	private String phone;
}
