package kosa.practice;

public class GeneralAccount extends Account {

	
	
	public GeneralAccount(String id, int balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(int amount) {
		int balance=this.getBalance();
		this.setBalance(balance+=amount);

	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
