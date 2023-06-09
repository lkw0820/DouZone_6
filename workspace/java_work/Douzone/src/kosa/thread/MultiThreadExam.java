package kosa.thread;

import java.util.Random;

public class MultiThreadExam {
	public static class DigitThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0; i<10;i++) {
				System.out.println((int)(Math.random()*10));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
	public static class Korea implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			char arr[] = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
			for(char c : arr) {
				System.out.println(c);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new DigitThread();
		Thread thread1 = new DigitThread();
		Korea kor = new Korea();
		Thread thread2 = new Thread(kor);
		thread.start();
		thread1.start();
		thread2.start();
		for(char ch='A';ch<='Z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
