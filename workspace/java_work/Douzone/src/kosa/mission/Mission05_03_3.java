package kosa.mission;

import java.util.Scanner;

public class Mission05_03_3 {
	
	public static int solution(int n, int arr[][]) {
		int answer=0;
		int sum1 = 0;//가로
		int sum2 =0;//세로
		for(int i=0;i<n;i++) {
			sum1=0;
			sum2=0;
			for(int j=0;j<n;j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1=0;
		sum2=0;
		for(int i=0;i<n;i++) {
			sum1+=arr[i][i];//대각선
			sum2+=arr[i][n-i-1];//반대 대각선
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
//		int[] re = new int[n*2+2];
		int max=0;
		int colsum=0;//행
		int rowsum=0;
		int crosum=0;
		int rcrosum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				colsum+=arr[i][j];
				rowsum+=arr[j][i];
				if(i==j) {
					crosum+=arr[i][j];
				}
				if(i+j==n-1) {
					rcrosum+=arr[i][j];
				}
			}
			//Math.max사용
			if(colsum>max) {
				max=colsum;
			}
			if(rowsum>max) {
				max=rowsum;
			}
			if(crosum>max) {
				max=crosum;
			}
			if(rcrosum>max) {
				max=rcrosum;
			}
			colsum=0;
			rowsum=0;
		}
		System.out.println(max);
		System.out.println(solution(n,arr));
	}

}
