package kosa.thread;

public class SumMain {
	static int sum=0;
	
	public static class Sum50 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
//			try {
//				wait(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			for(int i=1;i<=50;i++) {
				sum +=i;
			}
		}
		
	}
	public static class Sum100 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub

			for(int i=51;i<=100;i++) {
				sum+=i;
			}
		}
		
	}
	public static void main(String[] args) {
		// t1 1~50까지 합 스레드
		//t2 51~100까지 합 스레드
		//main t1의 합 +t2의합 => 합:5050
//		Sum50 s50 = new Sum50();
//		Thread t1=new Thread(s50);
//		Sum100 s100 = new Sum100();
//		Thread t2 = new Thread(s100);
//		t1.start();
//		try {
//			Thread.sleep(5000);
//			t1.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		t2.start();
//		//Thread.sleep(500);
//		System.out.println(sum);
		
		SumThread t3 = new SumThread(1,50);
		SumThread t4 = new SumThread(51,100);
		t3.start();
		
		t4.start();
		
		try {
			t3.join(); //join메소드를 호출한 스레드는 main스레드는 일시정지한다
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("총합: "+(t3.getTotal()+t4.getTotal()));
	}

}
