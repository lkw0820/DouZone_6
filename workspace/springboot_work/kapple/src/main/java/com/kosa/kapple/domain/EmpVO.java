package com.kosa.kapple.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
