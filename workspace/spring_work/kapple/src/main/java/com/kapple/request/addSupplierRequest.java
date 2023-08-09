package com.kapple.request;

import com.kapple.domain.ProposalVO;
import com.kapple.domain.SupplierVO;

import lombok.Data;

@Data
public class addSupplierRequest {
	 private SupplierVO supplier;
	 private ProposalVO proposal;
	 private String logo_uuid;
	 private String file_uuid;
}
