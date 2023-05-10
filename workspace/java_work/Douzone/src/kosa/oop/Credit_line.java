package kosa.oop;

public class Credit_line extends Account {
	private int credit;
	
	//생성자
	public Credit_line() {
		super();
	}
	public Credit_line(String accountNo, String ownerName, int balance, int credit) {
		super(accountNo, ownerName, balance);
		this.credit = credit;
	}

	//1.상속관계
	//2.메서드의 시그니처 일치(접근제어자, 리턴형, 이름, 파라미터)
	//3.메서드의 내용은 불일치(재정의)
	@Override
	public int withdraw(int amount) throws Exception {
		// TODO Auto-generated method stub
		int balance = getBalance();
		if(balance+credit<amount) {
			throw new Exception("잔액부족");
		}else {
			balance-= amount;
			if(getBalance()<amount) 
				credit-=Math.abs(balance);
			}
		setBalance(balance);
		return balance;
		//return super.withdraw(amount);
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("남은 신용 금액: "+ credit);
	}
	
	//get set
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	

}
