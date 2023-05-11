package kosa.practice;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	List<Member> arr = new ArrayList<Member>();
	
	//로그인 검색 null이면 로그인 실패
	public Member login() {
		System.out.print("아이디: ");
		String id = DataInput.sc.nextLine();
		for(Member m : arr) {
			if(m.getId().equals(id)) {
				System.out.println("로그인 성공");
				return m;
			}
		}
		return null;
	}
	//회원만
	public void addMember() {
		System.out.println("1.일반 회원 2.vip회원");
		System.out.print("멤버 분류: ");
		String menu = DataInput.sc.nextLine();
		System.out.print("아이디 입력: ");
		String id = DataInput.sc.nextLine();
		switch (menu) {
		case "1":
			arr.add(new GeneralMember(id));
			break;
		case "2":
			arr.add(new SpecialMember(id));
			break;
		}
	}
	//일반 계좌 체크카드 마이너스통장 마이너스통자은 vip만
	public void addAccount(Member name) {
		
		System.out.println("생성할 계좌종류 선택");
		System.out.println("1.일반 2.체크 3.마이너스통장");
		String menu = DataInput.sc.nextLine();
		System.out.print("계좌번호: ");
		String id = DataInput.sc.nextLine();
		System.out.println("잔액: ");
		int balance =Integer.parseInt(DataInput.sc.nextLine());
		switch (menu) {
		case "1":
			name.setAccount(new GeneralAccount(id,balance));
			break;
		case "2":
			System.out.print("카드번호 입력: ");
			String cardNo = DataInput.sc.nextLine();
			name.setAccount(new Check(id,balance,cardNo));
			break;
		case "3":
			
			break;
		}
	
	}

	public Member getMember() {
		return null;
	}
	
}
