package kosa.oop;

public class AccountMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account("4444-4444","이기원3",10000);
		CheckingAccount ca2 = new CheckingAccount();
		
		CheckingAccount ca = new CheckingAccount("2222-2222","이기원",5000,"2222-2222");
		Account account = ca;
		
		Account obj= new CheckingAccount("2222-2222","이기원",5000,"2222-2222");
		
		Credit_line ma = new Credit_line("3333-3333","이기원2",5000,10000);
		Account obj2 = ma;
//		ca.setAccountNo("111-11");
//		ca.setOwnerName("홍길동");
//		ca.setBalance(10000);
//		ca.setCardNo("111-11");
		Account[] arr = new Account[3];
		arr[0]=ac;
		arr[1]=obj;
		arr[2]=obj2;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof CheckingAccount) {
				CheckingAccount c=(CheckingAccount)arr[i];
				try {
					((CheckingAccount)arr[i]).pay("2222-2222",100);
					c.pay("2222-2222", 2000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				try {
					arr[i].withdraw(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			arr[i].print();
		}
		
		
		
		
//		try {
//			ca.pay("2222-2222", 500);
//			ma.withdraw(10000);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		ca.print();
//		ma.print();
	}

}
