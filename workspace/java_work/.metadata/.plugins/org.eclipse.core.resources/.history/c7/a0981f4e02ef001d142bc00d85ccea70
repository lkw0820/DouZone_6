package kosa.phone;

import java.util.*;

public class Manager {
	List<PhoneInfo> phones = new ArrayList<PhoneInfo>();;
	//Scanner sc = new Scanner(System.in);
	
	public Manager() {
		super();
		//phones = new ArrayList<PhoneInfo>();
	}

	public void addPhoneInfo(PhoneInfo p){
		
		phones.add(p);
	}
	//교수님
	public void addPhoneInfo(){
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();
		phones.add(new PhoneInfo(name,phoneNo,birth));
		System.out.println("전화번호가 등록 되었습니다.");
	}
	
	public void listPhoneInfo() {
		for(PhoneInfo p : phones) {
			System.out.println("이름: "+p.getName());
			System.out.println("전화번호: "+p.getPhoneNo());
			System.out.println("생년월일: "+p.getBirth());
			System.out.println();
		}
	}
	//교수님
	public void listPhoneInfo2() {
		for(PhoneInfo p : phones) {
			p.show();
			System.out.println();
		}
	}
	
	public void searchPhoneInfo(String sname) {
		for(PhoneInfo p :phones) {
			if(p.getName().equals(sname)) {
				System.out.println("검색한 이름: "+p.getName());
				System.out.println("검색한 번호: "+p.getPhoneNo());
				System.out.println("검색한 생일: "+p.getBirth());
			}
		}
	}
	//교수님
	public void searchPhoneInfo() {
		System.out.print("이름");
		String name = DataInput.sc.nextLine();
		int idx = -1;
		for(PhoneInfo p :phones) {
			if(p.getName().equals(name)) {
				p.show();
				break;
			}
			idx++;
		}
		if(idx==-1) {
			System.out.println("존재X");
		}
	}
}
