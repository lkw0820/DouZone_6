package com.kosa.kapple.domain;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonFilter("Component")
public class ComponentVO {
	private String compo_no;
	private String compo_name;
	private String unit;
	private String detail;
}
