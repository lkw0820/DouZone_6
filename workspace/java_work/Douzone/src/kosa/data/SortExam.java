package kosa.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {

	public static void main(String[] args) {
		// 자료구조.sort(); sort(자료구조)
		// 기본정렬기준: Comparable => compareTo() 오버라이딩
		// 정렬기준 변경: Comparator => compare() 오버라이딩
		
		Random r= new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
			//2차원 배열 정렬할때 써봄
			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순 정렬기준 변경
				if(o1<o2) {
					return 1;
				}else if(o1>o2) {
					return -1;
				}
				return 0;
			}
		});
		
		for(int i =0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}

}
