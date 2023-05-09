package kosa.oop;

public class CheckingAccount extends Account {
	//
	private String cardNo;
	
	//생성자
	public CheckingAccount() {
		super();
	}
	
	
	public CheckingAccount(String cardNo) {
		//부모의 생성자를 호출
		super(); //-> 부모의 default 생성자를 호출 -> 부모의 객체도 생성
		this.cardNo = cardNo;
	}


	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}


	//method
	public int pay(String cardNO, int amount) throws Exception{
		if(!cardNO.equals(this.cardNo) || getBalance()<amount) {
			throw new Exception("결재불능");
		}
		return withdraw(amount);
	}

//set get
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
}
