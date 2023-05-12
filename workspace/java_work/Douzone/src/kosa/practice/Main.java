package kosa.practice;

public class Main {

	public static void main(String[] args) {
		// 은행 시스템 일반 고객 vip 고객 나눔
		//vip 일반 + 마이너스 통장 개설 가능
		// 일반 일반 계좌, 체크카드 사용가능
		//회원 가입 기능
		//리스트로 저장
		
		//interface account 
		//클래스 마이너스통장, 일반, 체크카드 , 일반 회원, vip회원
		
		//추상클래스 필드
		//회원 - 계좌번호 잔액 회원이름
		//추상클래스 메소드
		//잔액보기
		
		//일반 회원 vip회원
		//manager로 입출금 등 관리
		//필드
		//일반 계좌번호, 잔액
		//체크 계좌번호, 잔액, 카드번호
		//마이너스 계좌번호, 잔액, 남은 신용
		//메소드 -> 입출금 계좌 클래스 잔액보기 회원
		//일반 입출금 잔액보기
		//체크 입출금 잔액보기
		//마이너스 입출금 잔액보기+ 신용
		
		Manager m = new Manager();
		Member name=null;
		while(true) {
			System.out.println("1.로그인 2.회원추가");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				do {
					name=m.login();//아이디
					if(name==null)
						System.out.println("로그인 실패");
				}while(name==null);
				break;
			case "2":
				m.addMember();
				break;


			
		}
}

	}

}
