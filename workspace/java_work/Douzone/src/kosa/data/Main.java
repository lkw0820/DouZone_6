package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int totalSales=0;
	public static void addOrder(LinkedList<Order> list) {
		System.out.print("음식 이름");
		String foodName = sc.nextLine();
		System.out.print("음식 가격");
		String price = sc.nextLine();
		System.out.print("음식 수량");
		String amount = sc.nextLine();
		//list.offer(new Order(new Food(foodName,price),amount));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Order> list = new LinkedList<Order>();
		
		while(true) {
			System.out.println("1.주문요청 2.주문처리 3.매출액 4.종료");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":
				
				return;
		}
	}

}
