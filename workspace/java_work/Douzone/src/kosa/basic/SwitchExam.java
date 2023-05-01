package kosa.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.햄버거 2.피자 3.콜라 4.기타");
		System.out.print("메뉴선택");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("햄버거");
			break;
		case 2:
			System.out.println("피자");
			break;
		case 3:
			System.out.println("콜라");
			break;
		default:
			System.out.println("기타");
			break;
		}
	}

}
