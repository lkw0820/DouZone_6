package kosa.basic;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// 조건문: while, do~while, for
		// while: 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		//1~10까지 함
//		int sum=0;
//		//초기식
//		int i=1;
//		//조건식
//		while(i<=10) {
//			//명령문
//			sum+=i;
//			//증감식
//			i++;
//		}
//		System.out.println("1~10까지의 합: "+sum);
		
		//퀴즈 구구단 7단 출력
		
//		int i=1;
//		while(i<=9) {
//			System.out.println("7 * "+i+" = "+(7*i));
//			i++;
//		}
		
		//for문: 초기식 -> 조건식 -> 명령문 -> 증감식
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println("1~10까지의 합: "+sum);
		//구구단 7단 for
//		for(int i=1;i<=9;i++) {
//			System.out.println("7 * "+i+" = "+(7*i));
//		}
		//퀴즈 1~100 숫자 중 2 또는 3의 배수가 아닌것
//		for(int i=1;i<=100;i++) {
//			if(!(i%2==0)&&!(i%3==0)) {
//				System.out.println(i);
//			}
//		}
		//퀴즈 1~100 숫자 중 2 또는 3의 배수가 아닌것 continue사용
//		for(int i=1;i<=100;i++) {
//			if(i%2==0 || i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		//do while
		//명령문을 먼저 실행 후 조건 비교
		// 적어도 1번은 무조건 실행이 필요할때
		// 예) 어떤 유효한 값을 입력 받기 위해
		//음수를 입력받으면 새롭게 다시 입력
		Scanner sc = new Scanner(System.in);
//		int n =0;
//		do {
//			System.out.print("양의 정수를 입력하세요: ");
//			n=sc.nextInt();
//		}while(n<0);
//		System.out.println("입력값: "+n);
		//퀴즈 2개의 정수를 입력 받아 b-a 결과 출력
		//항상 b> a보다 => a>b이면 다시 입력
		int a=0;
		int b=0;
//		do {
//			System.out.println("b가 a보다 크다");
//			System.out.print("a : ");
//			a=sc.nextInt();
//			System.out.print("b : ");
//			b=sc.nextInt();
//		}while(a>b);
//		System.out.println("b-a= "+(b-a));
		while(true) {
			System.out.println("b가 a보다 크다");
			System.out.print("a : ");
			a=sc.nextInt();
			System.out.print("b : ");
			b=sc.nextInt();
			if(a<b) 
				break;
		}
	}
	

}
