package kosa.oop5;

public class Reader extends Man implements Speakable {
	
	
	public Reader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		String str = getName()+" 자바화이팅";
		return str;
	}

}
