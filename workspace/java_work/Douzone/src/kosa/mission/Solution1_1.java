package kosa.mission;

import java.util.Scanner;

public class Solution1_1 {
	public static int solution(String str, char c) {
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		//1
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c)answer++;
		}
		//2
		for(char x : str.toCharArray()) {
			if(x==c)answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.nextLine().charAt(0);//0번재를 char로 형변환
		
		System.out.println(solution(str,c));
		
	}

}
