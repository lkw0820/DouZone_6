package kosa.oop;

import java.util.Scanner;

public class Account_oop3 {

	public static void main(String[] args) {
		// 1. 계좌 발급 2. 전체 계좌 출력 3. 계좌 조회 4. 계좌 입금  5. 계좌 출금
		Scanner sc = new Scanner(System.in);
		Account[] a = new Account[10];
		int cnt =0;
		while(true) {
			System.out.println("1.계좌 발급 2.전체 계좌 출력 3.계좌 조회 4.계좌 입금 5.계좌 출금 6.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			
			System.out.println();
			switch (menu) {
			case "1":
				System.out.print("계좌번호:");
				String ac = sc.nextLine();
				System.out.print("이름");
				String name = sc.nextLine();
				System.out.print("잔액:");
				int bal = Integer.parseInt(sc.nextLine());
				a[cnt++]=new Account(ac,name,bal);
				System.out.println("새로운 계좌 발급");
				break;
			case "2":
				for(int i=0;i<cnt;i++) {
					a[i].print();
				}
				break;
			case "3":
				System.out.print("계좌번호:");
				ac = sc.nextLine();
				for(int i=0;i<cnt;i++) {
					if(ac.equals(a[i].accountNo)) {
						a[i].print();
						break;
					}
				}
				break;
			case "4":
				System.out.print("계좌번호:");
				ac = sc.nextLine();
				for(int i=0;i<cnt;i++) {
					if(ac.equals(a[i].accountNo)) {
						System.out.println("입금할 금액: ");
						int amount = Integer.parseInt(sc.nextLine());
						a[i].deposit(amount);
						System.out.println("입금완료");
						break;
					}
				}
				break;
			case "5":
				System.out.print("계좌번호:");
				ac = sc.nextLine();
				for(int i=0;i<cnt;i++) {
					if(ac.equals(a[i].accountNo)) {
						System.out.println("출금할 금액: ");
						int amount = Integer.parseInt(sc.nextLine());
						try {
							a[i].withdraw(amount);
							System.out.println("출금완료");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("입금완료");
						break;
					}
				}
				break;
			case "6":
				System.out.println("종료");
				return;
			}
		}
	}
}
