package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackExam {
	public static boolean bracket(String str) {
		Stack<String> stack = new Stack<String>();
		String[] arr = str.split("");
		try {
			for(String s: arr) {
				if(s.equals("(")||s.equals("[")||s.equals("{")) {
					stack.push(s);
				}
				if(s.equals(")")||s.equals("]")||s.equals("}")) {
//					if(stack.isEmpty()) {
//						return false;
//					}
					stack.pop();
				}
			}
		}catch(Exception e) {
			return false;
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 키보드로 수학수식 입력
		//((2+3)+10) => 괄호 일치/불일치 판단
		Scanner sc = new Scanner(System.in);
		System.out.println("수식입력");
		String str = sc.nextLine();
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			if(ch=='(') {
//				stack.push(ch+"");
//			}else if(ch==')') {
//				stack.pop();
//			}
//		}
		if(bracket(str)) {
			System.out.println("괄호 일치");
		}else {
			System.out.println("괄호 불일치");
		}
		
	}

}
