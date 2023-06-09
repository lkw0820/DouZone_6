package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// 1. 배열 선언, 생성 분리
//		int arr[];//배열 선언 => 배열의 주소값을 저장할 수 있는 변수가 생성
//		arr = new int[5]; //배열을 생성 => int형 변수 5개을 생성하고 그 주소를 arr에 대입
//		//2. 배열선언, 생성 한번에
//		int arr2[] = new int[5];
//		
//		arr[0]=10;//배열의 인덱스를 이용한 직접 초기화
//		arr[1]=20;
//		
//		//3. 배열 선언, 생성, 초기화 한번에
//		int arr3[] = {1,2,3,4,5};
//		
//		//배열 내용을 전체 출력 for문 이용(0~4)
//		for(int i=0;i<arr3.length;i++) {
//			System.out.println("arr["+i+"] = "+arr3[i]);
//		}
//		
//		//향상된 for문
//		for(int n: arr3) {
//			System.out.println(n);
//		}
		
		//배열 사용방법
		//1.배열에 사용될 데이터 타입을 결정
		//2.배열의 크기를 결정 => 초과 사용시 예외 발생 =>ArrayIndexOutOfBoundsException
		//3.배열을 생성(1,2,3)
		//4.배열 초기화(직접인덱스, for문, 생성과 동시)
		//5.배열에 있는 데이터 출력(for문, 향산된 for문, 인덱스 직접 접근)
		
		//퀴즈 > 키보드로부터 문자열을 입력받아 배열에 추가후 전체를 출력
		//"q"를 입력할 때까지 입력 받는다
		// 입력: 홍길동
		// 입력: 박길동
		// 입력: q
		//출력: 홍길동, 박길동
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[10];
		int cnt=0;
		while(true) {
			System.out.print("입력: ");
			String str = sc.nextLine();
			if(str.equals("q")) break;
			arr[cnt++]=str;
		}
		System.out.print("출력:");
		for(int i=0;i<cnt;i++) {
			System.out.print(arr[i]+", ");
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print("입력: ");
//			arr[i]=sc.nextLine();
//			if(arr[i].equals("q")) {
//				break;
//			}
//		}
//		System.out.print("출력: ");
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].equals("q"))
//				break;
//			System.out.print(arr[i]+", ");  
//		}
		
	}

}
