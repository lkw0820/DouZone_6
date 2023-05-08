package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager(); //메소드 안에 있으므로 Main과 Manager는 의존관계
		
		while(true) {
			System.out.println("1.추가 2.전체출력 3.검색 4.종료");
			System.out.print("메뉴: ");
			String num = sc.nextLine();
			//sc.nextLine();
			switch (num) {
			case "1":
//				System.out.print("이름: ");
//				String name = sc.nextLine();
//				System.out.print("전화번호: ");
//				String phoneNo = sc.nextLine();
//				System.out.print("생년월일: ");
//				String birth = sc.nextLine();
//				PhoneInfo p = new PhoneInfo(name,phoneNo,birth);
//				m.addPhoneInfo(p);
//				System.out.println("전화번호가 등록 되었습니다.");
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				System.out.print("검색 이름: ");
				String sname = sc.nextLine();
				m.searchPhoneInfo(sname);
				break;
			case "4":
				System.out.println("종료");
				return;
			}
		}
		
		

	}

}
