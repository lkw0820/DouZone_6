package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("홍길동",20);
		
		String s1 = "abc";
		String s2 = "abc";
		if(s1.equals(s2)) { //equals메소드를 오버라이딩 해서 
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(p1.equals(p2)) { //객체의 주소값 비교
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		String str = new String("abc");
		
		//print는 toString메소드를 호출한다
		System.out.println(str);//문자열은 오버라이딩해서 문자열 출력
		System.out.println(p1); //주소값
		
		Integer obj = new Integer("11");
		int sum = obj+20;
		System.out.println(sum);
		Integer obj2 = new Integer("qwe");
		System.out.println(obj2);
	}

}
