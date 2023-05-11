package kosa.practice;

public class Credit_line extends Account {
	private int credit;

	public Credit_line() {
		super();
	}

	public Credit_line(String id, int balance, int credit) {
		super(id, balance);
		this.credit = credit;
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
	@Override
	public void show() {
		super.show();
		System.out.println("남은 신용: "+credit);
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}
