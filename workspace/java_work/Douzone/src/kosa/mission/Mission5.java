package kosa.mission;

import java.util.Scanner;

public class Mission5 {

	public static void main(String[] args) {
		// 두정수와 연산자를 입력 받아 결과를 출력하시오
		//예) 첫번째 정수: 10
		//	   두번째 정수: 5
		//    연산자: *
		//	  결과: 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수:");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수:");
		int n2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자:");
		String op = sc.nextLine();
		
		switch (op) {
		case "+":
			System.out.println(n1+n2);
			break;
		case "-":
			System.out.println(n1-n2);
			break;
		case "*":
			System.out.println(n1*n2);
			break;
		case "/":
			System.out.println(n1/n2);
			break;
		case "%":
			System.out.println(n1%n2);
			break;
		default:
			break;
		}


	}

}
