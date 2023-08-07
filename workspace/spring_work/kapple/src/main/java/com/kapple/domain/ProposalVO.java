package com.kapple.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
	public SupplierVO getSupplier() {
        return supplier;
    }
}
