package kosa.service;

import org.springframework.stereotype.Service;

import kosa.model.Member;
@Service
public class MemberService {
	public void Info(Member m) {
		System.out.println("service 호출");
		System.out.println(m);
	}
}
