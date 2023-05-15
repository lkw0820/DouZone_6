package kosa.baseballsolu;

import java.util.Scanner;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BaseBall b = new BaseBall();
		int strike=0;
		int ball =0;
		int count = 0;
		int[] input = new int[3];
		
		do {
			System.out.print("숫자입력 3자리:");
			for(int i=0;i<3;i++) {
				input[i]=sc.nextInt();
			}
			strike=b.countStrike(input);
			ball=b.countBall(input);
			System.out.println(strike+"S "+ball+"B");
			count++;
		}while(strike!=3);
		
		System.out.println(count + "번째 성공했습니다.");
	}

}
