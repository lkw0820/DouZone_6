package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study study = new Study();
		Role work= new Work();
		
		Person p = new Person("이기원", study);
		Person p2 = new Person("이기원2", work);
		Person p3 = new Person("이기원3",new Role() {
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("Driver 역할");
			}
		});
		p.doIt();
		p2.doIt();
		p3.doIt();
	}
}
