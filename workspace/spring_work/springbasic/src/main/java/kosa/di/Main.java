package kosa.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory = new GenericXmlApplicationContext(resource);
		
		Service service= (Service)factory.getBean("writeService");
		service.insertSerivce();
	}

	
}
