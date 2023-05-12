package kosa.oop7ex4;

interface A{
	B abc();
}
class B{
	B(){
		System.out.println("생성자");
	}
}
class C implements A{

	@Override
	public B abc() {
		B b= new B();
		return b;
	}
	
}

public class RefExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0
		C c = new C();
		c.abc();
		//1
		A a1 = new A() {
			
			@Override
			public B abc() {
				// TODO Auto-generated method stub
				B b = new B();
				return b;
			}
		};
		a1.abc();
		//2 
		A a2 = () -> new B();
		a2.abc();
		//3
		A a3 = B :: new;
		a3.abc();

	}

}
