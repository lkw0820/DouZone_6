package kosa.oop;

public class AccountMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca2 = new CheckingAccount();
		CheckingAccount ca = new CheckingAccount("2222-2222","이기원",5000,"2222-2222");
		Credit_line ma = new Credit_line("3333-3333","이기원2",5000,10000);
//		ca.setAccountNo("111-11");
//		ca.setOwnerName("홍길동");
//		ca.setBalance(10000);
//		ca.setCardNo("111-11");
		
		try {
			ca.pay("2222-2222", 500);
			ma.withdraw(10000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		ca.print();
		ma.print();
	}

}
