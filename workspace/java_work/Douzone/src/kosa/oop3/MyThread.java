package kosa.oop3;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			System.out.println(i);
		}
			
	}
	public static void action(Calculable calculable) {
		int x =10;
		int y =4;
		calculable.calculable(x,y);
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MyThread my = new MyThread();
//		Thread  t = new Thread(my);
//		
//		t.start();
//		
//		for(int i=11;i<=20;i++) {
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				
//			}
//			System.out.println(i);
//		}
		
		
		action((x,y)->{
			int re = x+y;
			System.out.println("result: "+re);
		});
		
		action((x,y)->{
			int re = x-y;
			System.out.println("result: "+re);
		});

	}
}
