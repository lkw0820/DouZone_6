package kosa.io;

import java.io.Serializable;

public class Member implements Serializable{
	private String name;
	private Video video;

	public Member() {
		super();
	}

	public Member(String name) {
		super();
		this.name = name;
	}

	public Member(String name, Video video) {
		super();
		this.name = name;
		this.video = video;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	

}
