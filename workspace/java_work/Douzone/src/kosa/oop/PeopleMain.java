package kosa.oop;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people1 = new People();
		People people2 = new People(50, "여");
		People people3 = new People("이기원", 25);
		People people4 = new People("이기원2", 26, 500, "남");
		
		people3.eat(10);
		try {
			people3.run(30);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("이름: "+people3.name);
		System.out.println("나이: "+people3.age);
		System.out.println("체력: "+people3.hp);
		System.out.println("성별: "+people3.sex);

	}

}
