package kosa.practice;

public class Check extends Account {
	private String cardNo;
	

	public Check() {
		super();
	}

	public Check(String id, int balance, String cardNo) {
		super(id, balance);
		this.cardNo = cardNo;
	}

	@Override
	public void deposit(int amount) {
		int balance=this.getBalance();
		this.setBalance(balance+=amount);

	}

	@Override
	public boolean withdraw(int amount) {
		// TODO Auto-generated method stub
		return super.withdraw(amount);
	}
	
	public void show() {
		super.show();
		System.out.println("카드번호: "+cardNo);
	}
	
	//get set
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

}
