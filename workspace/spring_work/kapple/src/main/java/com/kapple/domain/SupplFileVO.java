package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SupplFileVO {
	private String suppl_file_no;
	private String suppl_no;
	private String supple_name;
	private Date reg_date;
	private String URL;
}
