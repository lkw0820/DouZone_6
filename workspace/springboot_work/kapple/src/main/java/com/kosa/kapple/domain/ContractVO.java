package com.kosa.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ContractVO {
	private String contract_no;
	private String suppl_no;
	private String compo_no;
	private String start_date;
	private String end_date;
	private String contract_date;
	private String proposal_no;
}
