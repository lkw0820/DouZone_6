package kosa.mission;

import java.util.Scanner;

public class Solution1_3 {
	public static String solution(String str) {
		String answer="";
		int m = 0; //가장 긴 문자열 길이
		String[] arr = str.split(" ");
		for(String x: arr) {
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// It is time to study
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//모듈을 나누어서 풀기 -> 함수 사용
		
		System.out.println(solution(str));
	}

}
