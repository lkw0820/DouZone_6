package kosa.oop;

public class Book {
	//필드
	String name;
	int price;
	//
	int dc_price;
	//static int cnt;
	
	//생성자
	public Book() {
		//this.cnt++;
	}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		//this.cnt++;
	}
	
	//메소드
	public int DC() {
		if(price>=30000) {
			dc_price=(int)(price*0.75); ///price*0.75 와 같다 dc_price=price*0.75;
		}else if(price>=20000) {
			dc_price=(int)(price*0.8);
		}else if(price>=15000) {
			dc_price=(int)(price*0.85);
		}
		return dc_price;
	}
	
	public void p_print(String name, int price, int disPrice) {
		System.out.println(name+" 교재는 정가는 "+price+"원 할인된 가격은 "+disPrice+"원 입니다");
	}
//	public tot_print() {
//		
//	}
	
	

}
