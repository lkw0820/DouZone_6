package kosa.order;

public class Order {

	private static int count=1; //주문 번호
	private int orderNo;
	private int cnt; //주문 개수
	private int orderprice;
	private Member m = new Member();
	private Item i= new Item();
	//생성자
	public Order() {
		super();
	}
//	public Order(int orderNo, int cnt, int orderprice) {
//		super();
//		this.orderNo = orderNo;
//		this.cnt = cnt;
//		this.orderprice = orderprice;
//		m=new Member();
//		i=new Item();
//	}
	
	//method
	public void report(String name, String address, String item, int price, int cnt) {
		this.m.setName(name);
		this.m.setAddress(address);
		this.i.setName(item);
		this.i.setPrice(price);
		this.cnt=cnt;
		this.orderprice=i.getPrice()*cnt;
		this.orderNo=count;
		count++;
	}
	public void show() {
		System.out.println("주문번호: "+this.orderNo);
//		System.out.println("회원 이름: "+this.m.getName());
//		System.out.println("회원 주소: "+this.m.getAddress());
		this.m.show();
//		System.out.println("주문한 상품 모델 명: "+this.i.getName());
//		System.out.println("주문한 상품 가격: "+this.i.getPrice());
		this.i.show();
		System.out.println("주문 수량: "+this.cnt);
		System.out.println("주문 금액: "+this.orderprice);
		System.out.println();
		
	}
	
	//getter setter
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}
	public Member getM() {
		return m;
	}
	public void setM(Member m) {
		this.m = m;
	}
	public Item getI() {
		return i;
	}
	public void setI(Item i) {
		this.i = i;
	}
	
}
