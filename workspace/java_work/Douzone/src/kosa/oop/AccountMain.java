package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체는 주소값을 가짐 => 참조형
		//자신의 클래스 이름이 데이터타입
		//객체 생성 => 인스턴스화
		//account=인스턴스 변수 or 객체
		Account account = new Account("1111-1111", "이기원3", 1000);
		Account account2 = new Account("3333-3333", "이기원4", 400000);
		
//		account.accountNo="1111-1111";
//		account.ownerName="이기원";
//		account.balance=10000;
//		
//		account2.accountNo="2222-2222";
//		account2.ownerName="이기원2";
//		account2.balance=30000;
//		
		account.deposit(5000);
		try {
			account.withdraw(3000);
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("계좌번호: "+account.accountNo);
		System.out.println("계좌주: "+account.ownerName);
		System.out.println("잔액: "+account.balance);
		System.out.println();
		
		System.out.println("계좌번호: "+account2.accountNo);
		System.out.println("계좌주: "+account2.ownerName);
		System.out.println("잔액: "+account2.balance);
		
		//클래스라는 붕어빵틀 안에 객체라는 붕어빵을 두개를 만들었기 때문이다
		//new로 메모리에 새로 생성되었기 때문

	}

}
