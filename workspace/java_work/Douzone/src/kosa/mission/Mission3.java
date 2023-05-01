package kosa.mission;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		// 임의의 정수값에 대하여 전체자리수중 짝수, 홀수 개수를 구하라 5자리
		// 5자리수 ex) 12345-
		//짝수의 개수 :2개
		//홀수의 개수 :3개
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리수 입력: ");
		int d = sc.nextInt();
		//int a1,a10,a100,a1000,a10000;
		int odd=0, even = 0;
		/*int[] a =new int[5];
		
		a[0]=d/10000;
		a[1]=(d-a[0]*10000)/1000;
		a[2]=(d-a[0]*10000-a[1]*1000)/100;
		a[3]=(d-a[0]*10000-a[1]*1000-a[2]*100)/10;
		a[4]=(d-a[0]*10000-a[1]*1000-a[2]*100-a[3]*10)/1;
		for(int i=0;i<a.length;i++) {
			int b=a[i]%2;
			if(a[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}*/
		String s = String.valueOf(d);
		String[] arr = s.split("");
		int[] iarr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			iarr[i]=Integer.parseInt(arr[i]);
			if(iarr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		/*even += (d/10000%2==0)?1:0;
		even += (d/1000%10%2==0)?1:0;
		even += (d/100%10%2==0)?1:0;
		even += (d/10%10%2==0)?1:0;
		even += (d%2==0)?1:0;
		odd=5-even;*/
		System.out.println("홀수:"+odd);
		System.out.println("짝수:"+even);
		
	
	}

}
