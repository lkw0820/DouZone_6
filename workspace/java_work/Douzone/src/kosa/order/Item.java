package kosa.order;

public class Item {
	private String name;
	private int price;
	
	//생성자
	public Item() {
		super();
	}
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//method
	public void show() {
		System.out.println("제품 이름: "+this.name);
		System.out.println("제품 가격: "+this.price);
	}
	
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
