package com.kapple.domain;

import lombok.Data;

@Data
public class BizCertificateVO {
	private String biz_no;
	private SupplierVO supplier;
	private RetailerVO retailer;
	private String large_category;
	private String sub_category;
	private String address;
}
