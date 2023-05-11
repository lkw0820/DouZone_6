package kosa.practice;

public abstract class Account {
	
	private String id;
	private int balance;
	
	//생성자
	public Account() {
		super();
	}
	public Account(String id, int balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	//method
	public abstract void deposit(int amount);
	public boolean withdraw(int amount) {
		if(this.balance<amount) {
			return false;
		}else {
			this.balance-=amount;
			return true;
		}
	};
	public void show() {
		System.out.println("계좌번호: "+id);
		System.out.println("잔액: "+ balance);
	};
	
	//get set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
