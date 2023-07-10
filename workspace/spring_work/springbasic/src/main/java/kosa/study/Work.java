package kosa.study;

import org.springframework.stereotype.Repository;

@Repository
public class Work implements Role {

	public void doing() {
		// TODO Auto-generated method stub
		System.out.println("work 역할");
	}

}
