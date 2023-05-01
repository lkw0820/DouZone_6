package kosa.mission;

import java.util.Scanner;

public class Mission4 {

	public static void main(String[] args) {
		// 로그인 예제
		//id pw 키보르로 입력 해당 아이디와 패스워드가 일치 -> 로그인 성공 아이디 다르면 -> 해당아이디가 존재x pass 다르면 =-> 비밀번호 다름
		
		String m_id="kosa";
		String m_pass="1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pw = sc.nextLine();
//		if(id.equals(m_id)) {
//			if(pw.equals(m_pass)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호가 일치하지 않습니다");
//			}
//		}else {
//			System.out.println("존재하지 않는 아이디 입니다");
//		}
		if(id.trim().equals(m_id)&&pw.trim().equals(m_pass)) { //trim() 양사이드 공백 제거
			System.out.println("로그인 성공");
		}else {
			if(!id.equals(m_id))
				System.out.println("존재하지 않는 아이디 입니다");
			else
				System.out.println("비밀번호가 일치하지 않습니다");
		}
	}

}
