package kosa.mission;

import java.util.Scanner;

public class Mission6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt=1;
		int k=0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		k=arr[0];
		for(int i=1;i<n;i++) {
			if(k<arr[i]) {
				cnt++;
				k=arr[i];
			}
		}
		//System.out.println(n);
		System.out.println(cnt);
		//System.out.println(n-cnt);


	}

}
