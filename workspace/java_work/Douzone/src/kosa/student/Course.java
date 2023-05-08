package kosa.student;

public class Course {
	private String name;

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//생성자
	public Course() {
		super();
	}

	public Course(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	public void show() {
		System.out.println("신청한 과목 이름: " + this.name);
	}

}
