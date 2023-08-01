package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ProposalVO {
	private String proposal_no;
	private SupplierVO supplier;
	private ComponentVO component;
	private Long price;
	private Long quantity;
	private float defective_rate;
	private String quality_grade;
	private String prod_period;
	private Date proposal_date;
}
