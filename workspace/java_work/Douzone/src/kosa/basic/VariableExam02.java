package kosa.basic;

public class VariableExam02 {

	public static void main(String[] args) {
		// 캐스팅
		// 암묵적 or 강제적 =>(데이터타입)
		
		//int <=> char
		char ch ='A'; //아스키코드
		System.out.println((int)ch);
		int num1=67;
		System.out.println((char)num1);
		for(int i=65;i<=90;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		//int <=> String
		String num2 = "1";
		int num3 = Integer.parseInt(num2); //문자->숫자
		int result = num3+100;
		System.out.println(result);
		int num4_1=10;
		String num5 = String.valueOf(num4_1);
		String num4 = Integer.toString(num3); //숫자 -> 문자
		String num6 = num4_1+"";
		
		String str = 7 + "7"+7; //777
		
		System.out.println(10%3);
		int num7 =1;
		num7 = num7+1;
		//복합대입연산자 -=,*= 등등
		num7+=1;
		num7++;
		
		int x=10;
		
		int y=x++;
		
		System.out.println(x);//11
		System.out.println(y);//10
		
		System.out.println(y++);
		System.out.println(y);
		
		double d= 3.14+1;
		System.out.println(d);
		if(d==4.14) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
