package kosa.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Pconfig {

//	@Bean
//	public Role work() {
//		return new Work();
//	}
//	@Bean
//	public Role study() {
//		return new Study();
//	}
	
	@Bean
	public Role role() {
	return new Study();
	}
	
	@Bean
	public Person person() {
		return new Person();
	}
}