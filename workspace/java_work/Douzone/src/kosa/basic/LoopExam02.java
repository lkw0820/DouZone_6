package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩for문
		//전체 구구단
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				System.out.println(i+" * "+j+" = "+i*j);
//			}
//		}
		
		//퀴즈 4x +5y = 60
//		for(int x=0;x<=60;x++) {
//			for(int y=0;y<=60;y++) {
//				if(4*x+5*y==60) {
//					System.out.println("x= "+x+", y= "+y);
//				}
//			}
//		}
		//퀴즈
//		for(int i=1;i<=5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=5;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
