package kosa.oop5;

public class Student extends Man {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public String speck() {
		String str =getName()+" 공부나 열심히 해";
		return str;
	}
}
