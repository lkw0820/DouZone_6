package kosa.data;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private LinkedList<Food> food;
	private int amount;
	private int tot;
	
	
	
	//생성자
	public Order() {
		super();
		food=new LinkedList<Food>();
	}

	//method
	public void request(String name, int price, int cnt) {
		// TODO Auto-generated method stub
		this.food.offer(new Food(name,price));
		this.amount = cnt;
	}
	
	public void process() {
		// TODO Auto-generated method stub
		try {
			Food reFood= food.poll();
			tot+=reFood.getPrice()*amount;
			System.out.println("처리된 음식 이름: "+reFood.getFoodName());
			System.out.println("처리된 음식 가격: "+reFood.getPrice());
		}catch(Exception e) {
			System.out.println("처리할 주문이 없습니다.");
		}
		
		
	}
	public void totalPrice() {
		// TODO Auto-generated method stub
		System.out.println("매출액 총액: "+tot);
		
	}

	//get set

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAmount() {
		return amount;
	}
	public LinkedList<Food> getFood() {
		return food;
	}
	public void setFood(LinkedList<Food> food) {
		this.food = food;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}




	

}
