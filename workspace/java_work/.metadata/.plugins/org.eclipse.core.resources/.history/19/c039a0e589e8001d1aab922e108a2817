package kosa.mission;

import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		//성적관리 구현
		//국 영 수 받고 총점과 평균 출력 (평균은 정수)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어:");
		int ko=sc.nextInt();
		System.out.print("영어:");
		int en=sc.nextInt();
		System.out.print("수학:");
		int ma=sc.nextInt();
		int tot = ko+en+ma;
		int avg= tot/3; 
		//double avg = tot/3.0 소수로 나옴
		//05.01 평균기준 학점 출력
		// 90이상 a
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
//		if(avg>=90) 
//			System.out.println("학점: A");
//		else if(avg>=80)
//			System.out.println("학점: B");
//		else if(avg>=70)
//			System.out.println("학점: C");
//		else if(avg>=60)
//			System.out.println("학점: D");
//		else
//			System.out.println("학점: F");
		switch (avg/10) {
		case 10: case 9:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");
			break;
		default:
			System.out.println("학점: F");
			break;
		}
		
		
	}

}
