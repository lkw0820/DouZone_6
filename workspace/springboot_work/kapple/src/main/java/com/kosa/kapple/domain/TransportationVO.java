package com.kosa.kapple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TransportationVO {
	private String transport_no;
	private String transport_category;
	private Long transport_charge;
	private String additional_condition;
}
