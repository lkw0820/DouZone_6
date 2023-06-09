package kosa.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {
	static List<String> arr = new ArrayList<String>();
	public static void add(String str) {
		arr.add(str);
	}
	public static void remove(String str) {
		
		try {
			int idx= Integer.parseInt(str);
			if(idx<0||idx>arr.size()-1) {
				System.out.println("없음");
				return;
			}
			arr.remove(idx);
		}catch(Exception e) {
			if(!arr.contains(str)) {
				System.out.println("없음");
				return;
			}
			arr.remove(str);
		}
	}
	public static void d_print() {
		for(String str:arr) {
			System.out.println(str);
		}
	}
	public static void d_print_I() {
		Iterator<String> iteractor = arr.iterator();
		while(iteractor.hasNext()) {
			String str = iteractor.next();
			System.out.println(str);
		}
	}


	public static void main(String[] args) {
		// List자료구조 활용 키보드로부터 문자열을 입력받아 처리하자
		//1.데이터 추가 2.데이터 삭제 3.데이터 출력(for, Iterator)
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력(for, Iterator)");
			System.out.print("선택: ");
			String menu=sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("데이터 입력:");
				String input = sc.nextLine();
				add(input);
				System.out.println("입력 완료");
				break;
			case "2":
				System.out.println("데이터 삭제");
				System.out.print("index or content: ");
				String remove = sc.nextLine();
				remove(remove);
				System.out.println("삭제 완료");
				break;
			case "3":
				System.out.println("데이터 출력");
				d_print_I();
				break;
			case "4":
				System.out.println("종료");
				return;

			default:
				break;
			}
		}

	}

}
