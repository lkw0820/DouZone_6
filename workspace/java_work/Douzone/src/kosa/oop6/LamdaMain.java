package kosa.oop6;

public class LamdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyType mt = new MyType() {
			@Override
			public void hello() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스 형식");
			}
		};
		mt.hello();
		
		//람다식 함수형으로 가기위해
		MyType my3 = () -> System.out.println("람다식");
		my3.hello();
		
		YourType you = (String message) -> {
			System.out.println("메세지: "+message);
		};
		
		you.talk("안녕");
		
		YourType you2 = message -> System.out.println("메세지: "+message);
		
		you2.talk("모르겠어");
		
		MyNumber mn = (int num1,int num2) -> (num1>num2)?num1:num2;
//			if(num1>num2) {
//				return num1;
//			}else {
//				return num2;
//			}
		System.out.println(mn.max(1, 2));
		
		Runnable thread = () ->{
			for(int i=1;i<=10;i++) { 
				try {
					System.out.println(i);
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(thread);
		t.start();
		//thread.run();

	}

}
