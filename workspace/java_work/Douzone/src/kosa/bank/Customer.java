package kosa.bank;

import java.io.Serializable;

public class Customer implements Serializable{
	private String id;
	private String name;
	private Account account;
	
	//생성자
	public Customer() {
		super();
	}
	public Customer(String id, String name, long balance) {
		super();
		this.id = id;
		this.name = name;
		this.account = new Account(id,balance);
	}
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	};

}
