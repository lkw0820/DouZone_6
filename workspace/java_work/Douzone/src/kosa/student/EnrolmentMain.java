package kosa.student;

public class EnrolmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("이기원");
		Student s2 = new Student("이기원2");
		Course ko = new Course("국어");
		Course en = new Course("영어");
		Course ma = new Course("수학");
		Course sc = new Course("과학");
		s1.enrolment(ko);
		s1.enrolment(sc);
		//s1.drop(ko);
		
		s2.enrolment(ko);
		s2.enrolment(en);
		s2.enrolment(ma);
		
		s1.show();
		s2.show();
		
		ko.show();

	}

}
