package kosa.student;

import java.util.*;

public class Student {
	private String name;
	private List<Course> list; //= new ArrayList<Course>(); 학생이 수강신청한 과목들

	//생성자
	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		this.name = name;
		list = new ArrayList<Course>(); //생성자를 통해서 arraylist를 만듬
	}

	//메소드
	public void enrolment(Course course) {
		list.add(course);
		course.addStudent(this);
		//list.get(list.size()-1).addStudent(this);
	}
	
	public void drop(Course course) {
		if(list.contains(course)) {//포함하면 삭제
			list.remove(course);
			course.removeStudent(this);
			//list.get(list.size()-1).removeStudent(this);
		}
	}
	
	public void show() {
		System.out.println("학생이름: "+this.name);
		for(Course c: list) {
			//c.show();
			System.out.println("수강과목: "+ c.getName());
		}
		System.out.println();
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getList() {
		return list;
	}

	public void setList(List<Course> list) {
		this.list = list;
	}
}
