package com.kosa.kapple.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Supplier")
public class SupplierVO {
	private String suppl_no;
	private TransportationVO transport;
	private String suppl_name;
	private String ceo_name;
	private String category;
	private String phone;
}
