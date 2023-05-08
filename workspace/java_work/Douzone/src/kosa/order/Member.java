package kosa.order;

public class Member {
	private String name;
	private String address;
	
	//생성자
	public Member() {
		super();
	}
	public Member(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	//method
	public void show() {
		System.out.println("회원 이름: "+this.name);
		System.out.println("회원 주소: "+this.address);
	}
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
