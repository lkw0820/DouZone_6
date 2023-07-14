package org.zerock.domain;

import lombok.Data;

@Data
public class Critera {
	//선택한 페이지
	private int pageNum;
	//페이지 당 보여줄 개수
	private int amount;
	public Critera() {
		this(1,10);
	}
	public Critera(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
