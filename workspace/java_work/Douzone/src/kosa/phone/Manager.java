package kosa.phone;

import java.util.*;

public class Manager {
	List<PhoneInfo> phones = new ArrayList<PhoneInfo>();;
	//Scanner sc = new Scanner(System.in);
	
	public Manager() {
		super();
		//phones = new ArrayList<PhoneInfo>();
	}

//	public void addPhoneInfo(PhoneInfo p){
//		
//		phones.add(p);
//	}
	//교수님
	public void addPhoneInfo(){
		//1.일반 2.동창 3. 동창
		System.out.println("1.일반 2.동창 3.회사");
		System.out.print("선택: ");
		String i= DataInput.sc.nextLine();
		
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();
		switch (i) {
		case "1":
			phones.add(new PhoneInfo(name,phoneNo,birth));
			break;
		case "2":
			System.out.print("학과: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학번: ");
			String year = DataInput.sc.nextLine();
			phones.add(new Universe(name,phoneNo,birth,major,year));
			break;
		case "3":
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직책: ");
			String position = DataInput.sc.nextLine();
			phones.add(new Company(name,phoneNo,birth,dept,position));
			break;

		}

		System.out.println("전화번호가 등록 되었습니다.");
	}
	
//	public void listPhoneInfo() {
//		for(PhoneInfo p : phones) {
//			System.out.println("이름: "+p.getName());
//			System.out.println("전화번호: "+p.getPhoneNo());
//			System.out.println("생년월일: "+p.getBirth());
//			System.out.println();
//		}
//	}
	//교수님
	public void listPhoneInfo() {
		//1.일반 2.동창 3.회사
		for(PhoneInfo p : phones) {
			p.show();
			System.out.println();
		}
	}
	public void listPhoneInfo2() {
		//1.일반 2.동창 3.회사
		System.out.println("1.일반 2.동창 3.회사 4.전체출력");
		System.out.print("선택: ");
		String i= DataInput.sc.nextLine();
		for(PhoneInfo p : phones) {
//			p.show();
//			System.out.println();
			switch (i) {
			case "1":
				if(!(p instanceof Universe || p instanceof Company)) {
					p.show();
				}
				break;
			case "2":
				if(p instanceof Universe)
					p.show();
				break;
			case "3":
				if(p instanceof Company)
					p.show();
				break;
			default:
				p.show();
				break;
			}
		}

	}
	
//	public void searchPhoneInfo(String sname) {
//		for(PhoneInfo p :phones) {
//			if(p.getName().equals(sname)) {
//				System.out.println("검색한 이름: "+p.getName());
//				System.out.println("검색한 번호: "+p.getPhoneNo());
//				System.out.println("검색한 생일: "+p.getBirth());
//			}
//		}
//	}
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
