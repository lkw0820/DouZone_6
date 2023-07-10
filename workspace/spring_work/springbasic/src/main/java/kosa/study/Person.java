package kosa.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Person {
	private String name;
	@Autowired
	//@Qualifier("work")
	private Role role;
	
	//생성자
	public Person() {
		super();
	}
	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();
	}
	
	
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
