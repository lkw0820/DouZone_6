package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ContractVO {
	private String contract_no;
	private SupplierVO supplier;
	private ComponentVO component;
	private Date start_date;
	private Date end_date;
	private Date contract_date;
}
