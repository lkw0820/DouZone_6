package kosa.mission;

import java.util.Scanner;

public class Mission6_1 {

	public static void main(String[] args) {
		// Updown 게임 구현
		//난수 생성 1~100=> 1개의 난수 생성
		//키보드로 부터 정수 입력(1~100)
		//입력한 숫자와 난수 비교
		//정답 : "ㅊㅊ 3번만에 성공" 종료
		//오답 : "UP" "Down"
		Scanner sc = new Scanner(System.in);
		int answer =(int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println(answer);
		while(true) {
			System.out.print("정답을 입력하세여: ");
			int a = sc.nextInt();
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
