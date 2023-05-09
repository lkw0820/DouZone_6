package kosa.oop;

public class Account {
	//계좌 객체 생성을 위해
	//상태(데이터) : 계좌번호, 계좌주, 잔액 => 멤버변수 ->초기화 x, 클래스범위 안에 선언, 객체의 라이프사이클과 같아
	//행동(기능) : 입금하다, 출금하다 => 멤버메소드
	
	private String accountNo;//계좌번호
	private String ownerName; //계좌주
	private int balance;//잔액
	
	
	//생성자
	//접근제어자o, 리턴x, 생성자이름=클래스이름(){}
	
	//디폴트 생성자, 기본 생성자 다른 생성자가 있으면 기본 생성자를 만들지 않는다 -> 다른 생성자를 만들면 기본 생성자를 만들어야한다
	public Account() {}
	//생성자이름이 서로 같은데 다른거를 쓰는 것 -> 오버로딩
	//메서드 이름이 같아도 매개변수의 개수, 타입을 구분하는것
//	public Account(String accountNo, String ownerName, int balance) {
//		//   멤버변수		지역변수
//		//this로 멤버변수 구분
//		this.accountNo=accountNo;
//		this.ownerName=ownerName;
//		this.balance=balance;
//	}
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//입금하다.
	public void deposit(int amount) {
		balance+=amount;
	}
	
	//출금하다.
	public int withdraw(int amount) throws Exception{// 예외처리는 여기서 처리하는 것이아니라 호출한데서 처리하는게 더 좋다
		if(balance<amount) {
			throw new Exception("잔액부족");
		}else {
			balance-=amount;
		}
		return balance;
//		try {
//			balance-=amount;
//			return amount;
//		}catch(Exception e) {
//			System.out.println("잔액부족");
//			return 0;
//		}
	}
	
	//계좌 정보 출력
	public void print() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("계좌주: "+ownerName);
		System.out.println("잔액: "+balance);
		System.out.println();
	}

	//set get

	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	

}
