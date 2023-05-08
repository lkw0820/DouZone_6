package kosa.phone;

public class PhoneInfo {
	private String name;
	private String phoneNo;
	private String birth;
	
	//생성자
	public PhoneInfo() {
		super();
	}

	public PhoneInfo(String name, String phoneNo, String birth) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	//method
	
	public void show() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phoneNo);
		System.out.println("생년월일: "+ birth);
	}
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	};
	

	
}
