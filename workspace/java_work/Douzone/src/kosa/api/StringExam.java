package kosa.api;

import java.util.Arrays;

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
		
		//indexOf
		//해당하는 문자열의 위치를 파악 => indexOf("문자열") => 해당 문자열의 시작 인덱스, 없으면 -1
		System.out.println(sql.indexOf("#"));
		
		//length
		//문자열 길이
		System.out.println(sql.length());
		
		//퀴즈 charAt(), length 이용해서 sql를 출력
		//charAt 문자하나 출력 Character형
		for(int i=0;i<sql.length();i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println();
		
		//문자열 부분추출 : subString(5) 5~끝
		//				subString(5,10) 5~9
		//퀴즈 board만 추출
		String a=sql.substring(sql.indexOf("b"), sql.indexOf("d")+1);
		//시작sql.indexOf("board");
//		끝sql.indexOf("b")+5
//		끝sql.indexOf("d")+1;
		System.out.println(a);
		String filename = "kosa.jpg";
		String head = filename.substring(0, filename.indexOf("."));
		String pattern = filename.substring(filename.indexOf(".")+1);
		System.out.println(head+" : "+pattern);
		
		//endWith
		//해당하는 문자열로 끝나는지 boolean 타입으로 리턴
		if(filename.endsWith("jpg")) {
			System.out.println("이미지 파일");
		}
		
		//equalsIgnoreCase
		//대소문자 구별하지 않고 같은지 비교
		String id="kosa";
		String m_id="Kosa";
		//toLowerCase 소문자로 변경
		m_id=m_id.toLowerCase();
		
		if(id.equalsIgnoreCase(m_id)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//trim 양사이드 공백 제거
		String m_id1="Kosa ";
		if(id.equalsIgnoreCase(m_id1.trim())) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//spilt
		//문자열 -> String[] 변환
		String fruits = "사과,포도,수박,배";
		String[] arr = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		//toCharArray
		//문자열 -> char[] 변환
		String str5 = "abcdef";
		char[] arr2 = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//getBytes
		//문자열 -> byte[] 변환
		String str6 = "ABCDEF";
		byte[] arr3 = str6.getBytes(); //아스키코드값
		System.out.println(Arrays.toString(arr3));
		
		//int -> 문자열 변환
		int n =10;
		//잘안씀
		String s = Integer.toString(n);
		String s2 = String.valueOf(n);
		
		String s3 = 10+"";
		
	}

}
