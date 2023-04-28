package kosa.mission;

import java.util.Scanner;

public class Mission1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이름 나이 주소를 변수에 각각 담아서 콘솔 출력
		String name ="lkw";
		int age = 25;
		String address = "인천";
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("주소: "+address);
		//변수 선언시 주의사항
		//변수명 특수문자 x,숫자x,소문자,_
		
		//기본 리터럴 : 기본적으로 데이터에 타입이 존재
		//10=>int ""=>String ''=>char, true=>boolean, 3.14=>double
		float a = (float)3.14f;
		//형변환(casting)
		//기준 byte<short<int<long<float<double
		double b=100; //암묵적 형변환
		int c = (int)3.14; //강제 형변환
		System.out.println(b);
		
		float num3 = 3.14f;
		long num4 = 100l;
		
		int num5=010; //8진수
		
		//키보드로 부터 데이터 입력
	
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int n1 = sc.nextInt(); //숫자 +enter nextInt() 다음 nextLine()할때만 발생
		//n1에 엔터값이 안들어가서 이 엔터값이 s1에 들어가서 오류남
		//오류해결방법 1
		//sc.nextLine();
		//오류해결방법 2 line으로 받아서 int로 형변환
		//int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("문자입력: ");
		String s1 = sc.nextLine();
		//

		System.out.println(n1);
		System.out.println(s1);
	}
}