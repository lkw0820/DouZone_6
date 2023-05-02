package kosa.basic;

public class MethodExam {
	//메서드(함수) 정의
	//접근제어자,(static),리턴형(void), 메서드 이름(파라미터(인자) 매개변수){}
	public static void printCharactor(char ch, int num) {
		for(int i=1;i<=num;i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	}
	//두 정수의 합을 리턴하는 메서드 구현
	public static int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

	public static void main(String[] args) {
		int re= add(10,20);
		System.out.println("re: "+add(20,20));

		//메서드 호출
		
		//특정문자를 여러번 출력
		printCharactor('!', 30);
		System.out.println();

		printCharactor('@', 20);
		System.out.println();
	}

}
