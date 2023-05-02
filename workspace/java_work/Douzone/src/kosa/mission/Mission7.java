package kosa.mission;

import java.util.Scanner;

public class Mission7 {
//	//추가 메소드 add()과일 추가
//	public static void add(String[] fruits) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("추가할 과일 이름: ");
//		String f = sc.nextLine();
//		for(int i=0; i<fruits.length;i++) {
//			if(fruits[i]==null) {
//				fruits[i]=f;
//				System.out.println();
//				return;
//			}
//		}
//	}
//	
//	//출력 메소드 print() 과일 목록 출력
//	public static void fprint(String[] fruits) {
//		int i=0;
//		while(true) {
//			if(fruits[i]==null) {
//				return;
//			}
//			System.out.println(fruits[i]);
//			i++;
//		}
//	}
	static int count=0;
	public static void add(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 과일 입력: ");
		String fruit = sc.nextLine();
		arr[count++]=fruit;
		System.out.println();
	}
	public static void fprint(String arr[]) {
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	//검색 해당 과일이 몇번째 위치
	public static void search(String arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 과일 입력: ");
		String fruit = sc.nextLine();
		int idx =-1;
		for(int i=0;i<count;i++) {
			if(fruit.equals(arr[i])) {
				idx=i;
				break;
			}
		}
		
		if(idx==-1) {
			System.out.println("존재하지 않습니다");
		}else {
			System.out.println((idx+1)+"번째에 존재한다");
		}
	}

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴의 명령문을 실행
		// 1.추가 2.출력 3.검색  4.종료
		Scanner sc = new Scanner(System.in);
		String[] fruits = new String[10];
		System.out.println("1.추가 2.출력 3.검색  4.종료");
		int i=0;
		
		while(true) {
			System.out.print("숫자를 입력하세요(1~4): ");
			i = sc.nextInt();

			switch (i) {
			case 1:
				System.out.println("추가 선택됨");
				add(fruits);
				break;
			case 2:
				System.out.println("출력 선택됨");
				fprint(fruits);
				break;
			case 3:
				System.out.println("검색 선택됨");
				search(fruits);
				break;
			case 4:
				System.out.println("프로그램 종료");
				return; //프로그램 종료

			}
		}
			
	}

}
