package kosa.basic;

public class LoopExam01 {

	public static void main(String[] args) {
		// 조건문: while, do~while, for
		// while: 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		//1~10까지 함
//		int sum=0;
//		//초기식
//		int i=1;
//		//조건식
//		while(i<=10) {
//			//명령문
//			sum+=i;
//			//증감식
//			i++;
//		}
//		System.out.println("1~10까지의 합: "+sum);
		
		//퀴즈 구구단 7단 출력
		
//		int i=1;
//		while(i<=9) {
//			System.out.println("7 * "+i+" = "+(7*i));
//			i++;
//		}
		
		//for문: 초기식 -> 조건식 -> 명령문 -> 증감식
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println("1~10까지의 합: "+sum);
		//구구단 7단 for
//		for(int i=1;i<=9;i++) {
//			System.out.println("7 * "+i+" = "+(7*i));
//		}
		//퀴즈 1~100 숫자 중 2 또는 3의 배수가 아닌것
//		for(int i=1;i<=100;i++) {
//			if(!(i%2==0)&&!(i%3==0)) {
//				System.out.println(i);
//			}
//		}
		//퀴즈 1~100 숫자 중 2 또는 3의 배수가 아닌것 continue사용
		for(int i=1;i<=100;i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	

}
