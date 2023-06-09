package kosa.oop7;



interface A{
	void abc(int num);
}
class B{
	void bcd(int num2) {
		System.out.println("메소드 호출"+num2);
	}
}
class C implements A{

	@Override
	public void abc(int num) {
		// TODO Auto-generated method stub
		B b = new B();
		b.bcd(num);
	}
	
}

public class RefExam01 {

	public static void main(String[] args) {
		//0. 원래
		C c = new C();
		c.abc(1);
		
		//1. 익명내부클래스
		A a= new A() {
			@Override
			public void abc(num) {
				// TODO Auto-generated method stub
				B b= new B();
				b.bcd(1);
			}
		};
		a.abc();
		
		//2. 람다식
//		B b = new B();
//		a.abc()->{
//			B b= new B();
//			b.bcd();
//		};
		A a2 = () ->{
			B b= new B();
			b.bcd();
		};
		a2.abc();
		
		//3.인스턴스참조 방식
		B b = new B();
		A a3=b::bcd;
		
		a3.abc();
	}

}
