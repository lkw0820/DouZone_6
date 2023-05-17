package kosa.bank;

import java.io.Serializable;

public class Account implements Serializable{
	private String id;
	private long balance;
	
	//생성자
	public Account() {
		super();
	}
	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	//method
	//입금
	public void deposit(long amount) {
		this.balance+=amount;
		System.out.println("입금완료");
	}
	//출금
	public boolean withdraw(long amount) {
		if(this.balance<amount) {
			return false;
		}else {
			this.balance-=amount;
			return true;
		}
	}
	
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	};
	
	
}
