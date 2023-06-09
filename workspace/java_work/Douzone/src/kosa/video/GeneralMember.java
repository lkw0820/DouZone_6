package kosa.video;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video vo = new Video();
	private Video[] v_list;
	private List<Video> list = new ArrayList<Video>();
	private int cnt=0;
	
	//생성자
	public GeneralMember() {
		super();
	}

	
	public GeneralMember(String id, String name, String address, int n) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.v_list = new Video[n];
	}


	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public GeneralMember(String id, String name, String address, Video vo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vo = vo;
	}


	public GeneralMember(String id, String name, String address, int num, String video_name, String actor) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vo = new Video(num,video_name,actor);
	}

	
	public void rental3(Video video) {
		this.vo=video;
		
	}
	public void rental2(Video video) {
		//배열의 길이 값보다 많이 넣으면 에러 발생 -> 에러처리 필요
		//if로 cnt가 v_list의 길이보다 커지면 실행 못하게 하면 됌
		this.v_list[this.cnt++]=video;
	}
	public void rental(Video video) {
		list.add(video);
	}

	public void info() {
		System.out.println("회원의 아이디: "+this.id);
		System.out.println("회원의 이름: "+this.name);
		System.out.println("회원의 주소: "+this.address);
		System.out.println("회원이 대여한 비디오 번호: "+this.vo.getNo());
		System.out.println("회원이 대여한 비디오 이름: "+this.vo.getName());
		System.out.println("회원이 대여한 비디오 주인공: "+this.vo.getActor());
	}
	public void show3() {
		System.out.println("회원의 아이디: "+this.id);
		System.out.println("회원의 이름: "+this.name);
		System.out.println("회원의 주소: "+this.address);
		vo.show();
	}
	public void show2() {
		System.out.println("회원의 아이디: "+this.id);
		System.out.println("회원의 이름: "+this.name);
		System.out.println("회원의 주소: "+this.address);
		for(int i=0;i<this.cnt;i++) {
			v_list[i].show();
		}
	}
	public void show() {
		System.out.println("회원의 아이디: "+this.id);
		System.out.println("회원의 이름: "+this.name);
		System.out.println("회원의 주소: "+this.address);
		for(Video v:list) {
			v.show();
		}
	}
	
	
	//getter setter
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


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


	public Video getVo() {
		return vo;
	}


	public void setVo(Video vo) {
		this.vo = vo;
	}


	public Video[] getV_list() {
		return v_list;
	}


	public void setV_list(Video[] v_list) {
		this.v_list = v_list;
	}


	public List<Video> getList() {
		return list;
	}


	public void setList(List<Video> list) {
		this.list = list;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
