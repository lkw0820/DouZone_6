package kosa.basic;

public class If_Exam {
	public static void main(String[] args) {
		String str1 = "abc";
		//String str2 = "abc"; //같다-> 같은게 있으면 있는것을 사용, 1,2 주소값 같음
		String str3 = new String("abc"); //다르다 -> 무조건 새로 만듬, 1,3 주소값이 다름
		if(str1.equals(str3)) { //==는 주소값을 비교 .equals값을 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
