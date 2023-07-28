package com.kapple.domain;

import java.util.Date;

import lombok.Data;
@Data
public class RetailFileVO {
	private String retail_file_no;
	private String retail_no;
	private String retail_file_name;
	private Date reg_date;
	private String URL;
}
