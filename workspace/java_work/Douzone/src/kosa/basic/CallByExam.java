package kosa.basic;

import java.util.Scanner;

public class CallByExam {

	public static int change(int num) {//매개변수 = 로컬변수
		num+=20;
		return num;
	}
	public static void change2(int brr[]) {
		brr[0]+=200;
	}
	public static void score_10(int score) {
		score+=10;
	}
	public static void avg_10(int students[]) {
		students[0]+=10;
	}
	public static void main(String[] args) {
		// CallByValue vs CallByReference
		// 값의 대한 호출 -> 값을 전달하는것 num이 넘겨지는것이 아닌 num안에 값이 넘겨진다
		//기존값에 영향 없음
		int num = 10;
		num=change(num);//num의 복사된 값을 전달 -> num'가 전달된것
		System.out.println(num);

		//주소에 대한 호출
		int arr[] = {100};
		change2(arr); //arr과 brr은 같은 주소값 참조
		System.out.println(arr[0]);
		
		//예제 학사 관리 점수 추가 callbyvalue
		int ko,en,ma;
		int[] students = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("ko:");
		ko=sc.nextInt();
		System.out.print("en:");
		en=sc.nextInt();
		System.out.print("ma:");
		ma=sc.nextInt();
		System.out.println("변하기전ko: "+ko);
		//callbyvalue여서 값이 변함이 없다
		score_10(ko);
		System.out.println("변환후ko: "+ko);
		
		int avg=(ko+en+ma)/3;
		students[0]=avg;
		System.out.println("변하기전avg: "+students[0]);
		//callbyreference여서 주소값을 전달하여 값이 변한다
		avg_10(students);
		System.out.println("변한후avg: "+students[0]);
		
	}

}
