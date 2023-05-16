package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Mission_Solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		
		while(true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.데이터 출력(for, Iterator)");
			System.out.print("선택: ");
			String menu=sc.nextLine();
			int idx=-1;
			switch (menu) {
			case "1":
				System.out.print("추가: ");
				list.add(sc.nextLine());
				break;

			case "2":
				idx=list.indexOf(sc.nextLine());
				if(idx!=-1) {
					list.remove(idx);
				}
				break;
			case "3":
				//for
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i)+", ");
				}
				System.out.println();
				//iterator
				Iterator<String> iter = list.iterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				}
				System.out.println();
				break;
			}
		}
	}

}
