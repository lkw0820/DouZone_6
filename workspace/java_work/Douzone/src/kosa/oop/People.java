package kosa.oop;

public class People {
	String name;
	int age;
	int hp;
	String sex;

	// 생성자
	// 기본 생성자
	People() {}
	
	People(int hp,String sex){
		this.name = "익명";
		this.age=20;
		this.hp=hp;
		this.sex=sex;
	}

	People(String name,int age){
		this(name,age,100,"남");
	}

	public People(String name, int age, int hp, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.hp = hp;
		this.sex = sex;
	}
	//메소드
	public void eat(int f) {
		hp+=f;
	}

	public int run(int d) throws Exception {
		if (hp < d) {
			throw new Exception("사망");
		} else {
			hp -= d;
		}
		return hp;
	}
}
