package kosa.mission;

import java.util.Scanner;

public class Mission05_03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//			System.out.println(b[i]);
			if (a[i] == b[i]) {
				// 비김
				System.out.println("D");
			} else {
				if (a[i] < b[i]) {
					if (a[i] == 1 && b[i] == 3) {
						System.out.println("A");
					} else {
						System.out.println("B");
					}

				} else if (a[i] > b[i]) {
					if (a[i] == 3 && b[i] == 1) {
						System.out.println("B");
					} else {
						System.out.println("A");
					}
				}
			}
		}
	}
}
