package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		// 지역(로컬)변수 2가지
		//1. 반드시 초기화 후 사용
		//2. 선언된 변수는 정의된 범위 안에서만 사용가능 → 특정 메서드 및 블럭 안에서 선언된 변수는 그범위 안에서만 사용 가능
		
		int num=0;
		num = num+1;
		System.out.println(num);
		
		//지역 변수는 선언된 위치가 매우 중요하다 => 변수의 사용 범위가 결정되기 때문
		int a = 0;
		if(num==1) {
			a=100;
		}
		System.out.println("a: "+a);
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.print(i+",");
		}
		System.out.println();
		System.out.println("최종 i값: "+i);
		
		//변수 사용시
		//1.어떤 종류의 데이터?
		//2.어디까지 사용?
		
		String s = "100";
		double d = Double.parseDouble(s); //문자 ->숫자
		String s2 = String.valueOf(d); //숫자 ->문자
		String s1 = Double.toString(d);
		
		int a1 =10;
		int b=20;
		int max = a1>b?a1:b;
		System.out.println(max);
	}

}
