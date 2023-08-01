package com.kapple.domain;

import lombok.Data;

@Data
public class EmpVO {
	private String emp_no;
	private DepartmentVO department;
	private String emp_name;
	private String email;
	private String phone;
	private String address;
	private String id;
	private String pw;
}
