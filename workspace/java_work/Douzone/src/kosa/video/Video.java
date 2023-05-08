package kosa.video;

public class Video {
	private int no;
	private String name;
	private String actor;
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Video() {
		super();
	}

	public Video(int no, String name, String actor) {
		super();
		this.no = no;
		this.name = name;
		this.actor = actor;
	}
	
	public void show() {
		System.out.println("회원이 대여한 비디오 번호: "+this.no);
		System.out.println("회원이 대여한 비디오 이름: "+this.name);
		System.out.println("회원이 대여한 비디오 배우: "+this.actor);
	}
}
