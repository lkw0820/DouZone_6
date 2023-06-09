package kosa.oop;

import java.util.Scanner;

public class AccountMain2 {
	public static void create(Account[] a) {
		Scanner sc = new Scanner(System.in);
		String num;
		String name;
		int balance;
		System.out.print("계좌번호: ");
		num=sc.nextLine();
		System.out.print("이름: ");
		name=sc.nextLine();
		System.out.print("잔액: ");
		balance=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==null) {
				a[i]=new Account(num,name,balance);
				return;
			}
		}
	};

	public static void tot_print(Account[] a) {
		int i=0;
		while(true) {
			if(a[i]==null) {
				return;
			}
			System.out.print(a[i].accountNo+"\t");
			System.out.print(a[i].ownerName+"\t");
			System.out.print(a[i].balance+"\t");
			System.out.println();
			i++;
		}
	}
	public static void search(Account[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 계좌 번호 입력: ");
		String s=sc.nextLine();
		for(int i=0;i<a.length;i++) {
			if(a[i]==null) {
				//System.out.println("계좌가 없음");
				break;
			}
				
			if(a[i].accountNo.equals(s)) {
				System.out.print(a[i].accountNo+"\t");
				System.out.print(a[i].ownerName+"\t");
				System.out.print(a[i].balance+"\t");
				System.out.println();
			}

		}
	}
	public static void deposit_withdraw(Account[] a, String menu) {
		if(menu.equals("4")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("입금할 계좌 번호 입력: ");
			String s=sc.nextLine();
			System.out.print("입금할 금액 입력: ");
			int m=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==null) {
					//System.out.println("계좌가 없음");
					break;
				}
				if(a[i].accountNo.equals(s)) {
					a[i].deposit(m);
				}
			}
		}else if(menu.equals("5")) {
			Scanner sc = new Scanner(System.in);
			System.out.print("출금할 계좌 번호 입력: ");
			String s=sc.nextLine();
			System.out.print("출금할 금액 입력: ");
			int m=sc.nextInt();
			for(int i=0;i<a.length;i++) {
				if(a[i]==null) {
					//System.out.println("계좌가 없음");
					break;
				}
				if(a[i].accountNo.equals(s)) {
					try {
						a[i].withdraw(m);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}


	public static void main(String[] args) {
		// 1. 계좌 발급 2. 전체 계좌 출력 3. 계좌 조회 4. 계좌 입금  5. 계좌 출금
		Scanner sc = new Scanner(System.in);
		Account[] a = new Account[10];
		while(true) {
			System.out.println("1.계좌 발급 2.전체 계좌 출력 3.계좌 조회 4.계좌 입금 5.계좌 출금 6.종료");
			System.out.print("메뉴: ");
			String menu = sc.nextLine();
			System.out.println();
			switch (menu) {
			case "1":
				create(a);
				break;
			case "2":
				tot_print(a);
				break;
			case "3":
				search(a);
				break;
			case "4":
				deposit_withdraw(a, menu);
				break;
			case "5":
				deposit_withdraw(a, menu);
				break;

			case "6":
				System.out.println("종료");
				return;
			}
		}
	}

}
