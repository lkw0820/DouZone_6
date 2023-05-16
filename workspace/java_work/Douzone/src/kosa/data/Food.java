package kosa.data;

public class Food {
	private String foodName;
	private int price;
	
	//생성자
	public Food() {
		super();
	}
	public Food(String foodName, int price) {
		super();
		this.foodName = foodName;
		this.price = price;
	}
	
	//set get
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
