package kosa.data;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		while(true) {
			System.out.println("1.주문요청 2.주문처리 3.매출액 4.종료");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				System.out.print("음식 이름 입력: ");
				String name = sc.nextLine();
				System.out.print("음식 가격 입력: ");
				int price = Integer.parseInt(sc.nextLine());
				System.out.print("음식 수량 입력: ");
				int cnt = Integer.parseInt(sc.nextLine());
				order.request(name,price,cnt);
				System.out.println("요청완료");
				break;
			case "2":
				System.out.println("주문 처리");
				order.process();
				System.out.println("처리 완료");
				break;
			case "3":
				System.out.println("매출액 총액");
				order.totalPrice();
				break;
			case "4":
				
				return;
		}


		}
	}

}
