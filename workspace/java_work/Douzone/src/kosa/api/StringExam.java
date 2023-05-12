package kosa.api;

public class StringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.String 클래스 생성 방법의 차이점
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		if(str==str2) { //같은 주소값 참조
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str==str3) {//str3는 새로운 주소값에 저장
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		//2. String 클래스는 불변성 특징 => StringBuffer, StringBuilder(가변성) : 얘네는 변경 가능
		//String은 메소드로 원본값 변경 불가능 
		//새로운 변수를 만들어서 사용 새로운 값을 리턴한다
		String str4=str.concat("DEF");
		System.out.println(str4);
		
		//StingBuffer, StringBuilder는 원본값 변경 가능
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		//연산자(+)를 통해서는 문자열 원본 변경가능
		String sql = "select * from board ";
		int num =10;
		if(num==10) {
			sql+="where num = 10";
		}
		System.out.println(sql);
	}

}
