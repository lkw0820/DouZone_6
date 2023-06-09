package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 배열의 내용에 따라 정렬
		int arr[] = { 3, 2, 5, 6,1 };
		// 배열의 내용 문자열로 출력
		System.out.println(Arrays.toString(arr));
		// 오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 퀴즈>내림차순
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		// 내림차순 정렬->오름차순 정렬후 반대로 바꾸어준다

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = temp;
		}

		System.out.println(Arrays.toString(arr));
//		
		int arr2[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } };
		System.out.println(Arrays.deepToString(arr2));
		// 2차원배열 정렬 :{{1,60},{2,90},{3,20}}
		// 첫번째 원소 기준으로 정렬하고싶음
		// comparator : 정렬기준
		Arrays.sort(arr2, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) { // 2차원 배열안에 1차원 배열이 온다
				// 정렬기준 정의
				// 정렬기준 작성=> 2차원 배열안에 1차원 배열의 첫번째 인덱스 기준으로 오름차순 정렬
				if (o1[0] < o2[0]) {
					return -1; //
				} else if (o1[0] > o2[0]) {
					return 1; // 바꾼다
				} else { // 같을때 -1로 해도 되지만 일반적으로 0으로 한다 -1,0은 바꾸지 않는다
					return 0;
				}
			}
		});
		System.out.println(Arrays.deepToString(arr2));
	}

}
