package com.kapple.domain;

import java.util.Date;

import lombok.Data;

@Data
public class SupplFileVO {
	private String suppl_file_no;
	private SupplierVO supplier;
	private String supple_name;
	private Date reg_date;
	private String URL;
}
