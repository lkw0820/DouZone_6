package com.kapple.domain;

import lombok.Data;

@Data
public class TransportationVO {
	private String transport_no;
	private String transport_category;
	private Long transport_charge;
	private String additional_condition;
}
