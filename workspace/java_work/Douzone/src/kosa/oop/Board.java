package kosa.oop;

public class Board {
	//상태: 글번호, 글제목, 글 작성자, 글 내용
	//기능 한개의 글정보 출력
	static int no;
	int num;
	String name;
	String writer;
	String contents;
	
	public Board() {
		super();
		this.num=no++;
	}

	public Board( String name, String writer, String contents) {
		super();
		this.num=no++;
		this.name = name;
		this.writer = writer;
		this.contents = contents;
	}
	
	public void info() {
		System.out.println(this.num+"\t"+this.name+"\t"+this.writer);
	}

}
