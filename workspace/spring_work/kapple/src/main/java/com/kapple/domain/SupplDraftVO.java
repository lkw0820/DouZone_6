package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SupplDraftVO {
	
	private String suppl_name;
	private String ceo_name;
	private String categories;
	private String phone;
	private String compo_no;
	private String compo_name;
	private Long price;
	private Long quantity;
	private float defective_rate;
	private String quality_grade;
	private String prod_period;
	private Date proposal_date;
	private String attachfile;
	private String address;
	private String logopath;
	
}
