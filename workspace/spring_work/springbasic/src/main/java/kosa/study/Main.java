package kosa.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new AnnotationConfigApplicationContext(Pconfig.class);
		
		Person p = (Person)factory.getBean("person");
		p.doIt();
		p.setName("이기원");
		System.out.println(p.getName());
	}

}
