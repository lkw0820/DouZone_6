package kosa.mission;

import java.util.Scanner;

public class Solution1_9 {
	public static int solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) {
			//1
			if(Character.isDigit(x)) answer +=x;
			//2
			if(x>= 48 && x<=57)answer +=x;
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
