package com.kosa.kapple.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProduceVO {
	String produce_no;
	Long quantity;
	ProductVO product;
	ComponentVO component;
	Date produce_date;
}
