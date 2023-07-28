package com.kapple.domain;

import lombok.Data;

@Data
public class ProposalVO {
	private String proposal_no;
	private String supp_no;
	private Long price;
	private Long quantity;
	private float defective_rate;
	private String quality_grade;
	private String prod_period;
}
