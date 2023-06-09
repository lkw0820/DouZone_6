package kosa.student;

import java.util.*;

public class Course {
	private String name;
	private List<Student> students;

	//생성자
	public Course() {
		super();
	}

	public Course(String name) {
		super();
		this.name = name;
		students=new ArrayList<Student>();
	}
	
	//메소드
//	public void show() {
//		System.out.println("신청한 과목 이름: " + this.name);
//	}
	public void addStudent(Student s) {
		students.add(s);
		
	}
	public void removeStudent(Student s) {
		students.remove(s);
	}
	public void show() {
		System.out.println("과목명: "+name);
		for(Student s: students) {
			System.out.println("수강 신청한 학생: "+s.getName());
		}
		
	}

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
