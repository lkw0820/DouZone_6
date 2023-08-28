package com.kosa.user;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {




	private int id;
	private String name;
	private Date joinDate;
	
	public User() {
		super();
	}

	public User(int id, String name, Date joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
}
