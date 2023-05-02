package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission6_1 {

	public static void main(String[] args) {
		// Updown 게임 구현
		//난수 생성 1~100=> 1개의 난수 생성
		//키보드로 부터 정수 입력(1~100)
		//입력한 숫자와 난수 비교
		//정답 : "ㅊㅊ 3번만에 성공" 종료
		//오답 : "UP" "Down"
		// random -> 난수(임의의 숫자)
		//1. Math.random() 0.0~0.99 : double
		//주사위 : 1~6
		//int num = (int)(Math.random()*6)+1
		//2. Random클래스 nextInt() import util해야함
//		Random r = new Random();
		//1~6
//		int num2 = r.nextInt(6)+1;
//		System.out.println(num2);
		Scanner sc = new Scanner(System.in);
		int answer =(int)(Math.random()*100)+1;
		int cnt=0;
		int a=0;
		//System.out.println(answer);
		while(true) {
			//입력의 범위 설정
			do {
				System.out.print("정답을 입력하세여(1~100): ");
				a = sc.nextInt();
			}while(a>100 || a<1);
			//System.out.print("정답을 입력하세여(1~100): ");
			//a = sc.nextInt();
			cnt++;
			if(answer==a) {
				System.out.println("ㅊㅊ "+cnt);
				break;
			}else if(a>answer){
				System.out.println("DOWN");
			}else if(a<answer) {
				System.out.println("UP");
			}
		}
	}
}
