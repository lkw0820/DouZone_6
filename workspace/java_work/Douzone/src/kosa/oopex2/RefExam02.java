package kosa.oopex2;

interface A{
	void abc();
}
class B{
	static void bcd() {
		System.out.println("정적 메소드");
	}
}

public class RefExam02 {
	public static void main(String[] args) {
		
		//1.
		A a = new A() {
			
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				B.bcd();
				
			}
		};
		a.abc();
		//2
		A a1 = ()->{
			B.bcd();
		};
		a1.abc();
		//3
		A a2 = B::bcd;
		a2.abc();
		
		
	}

}
