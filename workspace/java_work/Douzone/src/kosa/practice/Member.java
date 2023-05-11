package kosa.practice;

public abstract class Member {
	private String id;
	private Account account;
	
	//생성자
//	public Member() {
//		super();
//	}
	
	
	public Member(String id) {
		super();
		this.id = id;
		this.account = null; //계좌는 따로 추가
	}

//	public Member(String id, Account account) {
//		super();
//		this.id = id;
//		this.account = account;
//	}
	
	//Account가 추상클래스여서 안됨
//	public Member(String id, String ANo, int balance) {
//		this.id=id;
//		this.account = new Account(ANo,balance);
//	}

	//method
	public void show() {
		System.out.println("아이디: "+id);
		account.show();
	};

	
	//get set
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}
	
	//
}
