package kosa.order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o = new Order();
		o.report("이기원", "인천", "스마트폰", 10000, 10);
		o.show();

		//Order o2 = new Order();
		o.report("이기원2", "서울", "향수", 5000, 7);
		o.show();
		
		o.report("이기원3", "남동구", "옷", 7000, 2);
		o.show();
	}

}
