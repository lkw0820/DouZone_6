package kosa.api;

public class Person{
	

	private String name;
	private int age;
	//생성자
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//method
	//@Override 할라면 메소드의 시그니처 여기서는 매개변수가 같아야한다
	//이거는 아마도 오버로딩
	public boolean equals(Person p) {
		if(this.name.equals(p.getName())&&this.age==p.getAge()) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		if(this.name.equals(p.getName())&&this.age==p.getAge()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
