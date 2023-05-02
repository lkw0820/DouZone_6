package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {
	public static char grade(int ko,int en,int ma) {
		int tot = ko+en+ma;
		double avg= tot/3.0; 
		char grade;
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);
		if(avg>=90) 
			grade='A';
		else if(avg>=80)
			grade='B';
		else if(avg>=70)
			grade='C';
		else if(avg>=60)
			grade='D';
		else
			grade='F';
		return grade;
	}
	public static void total(int arr[]) {
		arr[3]= arr[0]+arr[1]+arr[2];
		//return sum;
	}
	public static void average(int arr[]) {
		arr[4]=arr[3]/3;
		//return avg;
	}
	public static void main(String[] args) {
		//성적 관리 총점과 평균을 메서드를 만들어서 구현
		Scanner sc = new Scanner(System.in);
		int tot;
		int avg;
//		System.out.print("국어:");
//		int ko=sc.nextInt();
//		System.out.print("영어:");
//		int en=sc.nextInt();
//		System.out.print("수학:");
//		int ma=sc.nextInt();
		
		//tot=total(ko,en,ma);
		//avg=average(tot);
		//System.out.println("(정답)총점: "+tot);
		//System.out.println("(정답)평균: "+avg);
		
		char g=grade(95,60,78);
		System.out.println("학점: "+g);
		//성적을 배열에 넣어서 관리 4번째 총점 5번째 평균
		int arr[] = new int[5];
//		String subject[] = {"국어","영어","수학"};
//
//		for(int i=0;i<3;i++) {
//			System.out.print(subject[i]+" 입력: ");
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("국어\t영어\t수학\t총점\t평균");
//		for(int n : arr) {
//			System.out.println(n+"\t");
//		}
		System.out.print("국어:");
		arr[0]=sc.nextInt();
		System.out.print("영어:");
		arr[1]=sc.nextInt();
		System.out.print("수학:");
		arr[2]=sc.nextInt();
		total(arr);
		average(arr);
		System.out.println("총점: "+arr[3]);
		System.out.println("평균: "+arr[4]);
		
	}

}
