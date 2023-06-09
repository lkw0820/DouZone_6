package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		Random r = new Random();
//		arr[i]=r.nextInt(45)+1;
		// 1~45중복되지 않는 로또번호를 6개 출력
		//1.배열
		int[] arr1= new int[6];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(arr1[i]==arr1[j]) {
					i--;
				}
			}
			//System.out.print(arr1[i]+"\t"); //중복되었던 것도 출력됨
		}
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		//2.List(contains(정수))
		List<Integer> arr2 = new ArrayList<Integer>();
//		for(int i=0;i<6;i++) {
//			int num=(int)(Math.random()*45)+1;
//			if(arr2.contains(num)) {
//				i--;
//			}
//			arr2.add(num);
//
//			System.out.print(arr2.get(i)+"\t");
//		}
		while(true) {
			int n = r.nextInt(45)+1;
			if(arr2.contains(n)) {
				continue;
			}else {
				arr2.add(n);
			}
			if(arr2.size()==6)break;
		}
		Collections.sort(arr2);
		System.out.println(arr2);
		
		//3.Set(TreeSet()) =>중복 허용X
		Set<Integer> arr3 = new TreeSet<Integer>();
		for(int i=0;arr3.size()<6;i++) {//set은 중복되면 값을 넣지 않으므로 6이면 중복되지 않은 수 6개가 채워진것이다
			arr3.add((int)(Math.random()*45)+1);
			
		}
		System.out.println(arr3);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

		
	}

}
