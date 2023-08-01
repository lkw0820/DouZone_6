package com.kapple.domain;

import lombok.Data;

@Data
public class RetailerVO {
	private String retail_no;
	private TransportationVO transport;
	private String retail_name;
	private String ceo_name;
	private String category;
	private String phone;
	private String scale_grade;
}
