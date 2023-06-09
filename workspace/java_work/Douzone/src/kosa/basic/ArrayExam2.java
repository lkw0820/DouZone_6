package kosa.basic;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 각 1차원 배열마다 2차원의 배열 크기 생성
		int arr[][];//2차원 배열 선언
		arr= new int[3][2];
		
		//2차원 배열의 크기를 다르게 생성
		int arr2[][] = new int[3][];
		arr2[0]=new int[2];
		arr2[1]=new int[3];
		arr2[2]=new int[4];
		
		//2차원 배열 선언, 생성, 초기화
		int[][] arr3 = {{1},{2,3},{4,5,6}};
		
		//arr3의 배열 내용 출력
//		for(int i=0;i<arr3.length;i++) {
//			for(int j=0;j<arr3[i].length;j++) {
//				System.out.print("arr["+i+"]["+j+"]="+arr3[i][j]+", ");
//			}
//			System.out.println();
//		}

		//2차원배열과 중첩  for문 사용
		for(int i=1;i<6;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
	}

}
