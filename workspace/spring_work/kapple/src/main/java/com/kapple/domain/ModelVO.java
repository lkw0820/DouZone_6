package com.kapple.domain;

import java.util.Date;

import lombok.Data;
@Data
public class ModelVO {
	private String model_no;
	private String capacity;
	private String color;
	private Date release_date;
	private String model_name;
}
