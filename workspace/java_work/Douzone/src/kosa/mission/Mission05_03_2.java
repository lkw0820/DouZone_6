package kosa.mission;

import java.util.Scanner;

public class Mission05_03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int score = 0;
		int point = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				score++;
				if (i != 0 && a[i - 1] == 1) {
					point++;
					score += point;
				} else {
					point = 0;
				}
			}
		}
		System.out.println(score);
	}

}
