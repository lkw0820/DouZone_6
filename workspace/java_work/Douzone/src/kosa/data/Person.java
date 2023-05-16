package kosa.data;

public class Person implements Comparable<Person>{
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
	
	@Override
	public int compareTo(Person o) {
		//나이순 오름차순
		if(age<o.getAge()) {
			return -1;
		}else if(age>o.getAge()) {
			return 1;
		}
		return 0;
	}
	
	//set get
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
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
}
