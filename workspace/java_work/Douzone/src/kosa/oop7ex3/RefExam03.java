package kosa.oop7ex3;

public class RefExam03 {
	
	interface A{
		int abc(String str);
	}

	public static void main(String[] args) {
		// 1
		A a1 = new A() {
			
			@Override
			public int abc(String str) {
				// TODO Auto-generated method stub
				
				return str.length();
			}
		};
		System.out.println(a1.abc("안녕"));
		
		//2 return문 하나만 있으면 생략가능
		A a2 = (String str)->
			str.length();
		
		System.out.println(a2.abc("하이루"));
		
		//3
		A a3 = String::length;
		System.out.println(a3.abc("으아아앙"));
		
	}

}
