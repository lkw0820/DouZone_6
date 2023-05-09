package kosa.bank;

public class MyBank {
	private Customer[] customers;
	public static int customersNum;
	
	public MyBank() {
		customers= new Customer[10];
	}
	public void addCustomer(String id, String name, long balance){
		customers[customersNum++]=new Customer(id,name,balance);
	}
	
	public int getCustomersNum() {
		int num=customersNum;
		return num;
	}
	
	public Customer getCustomer(String id) {
		for(int i=0;i<customersNum;i++) {
			if(customers[i].getId().equals(id)) {
				return customers[i];
			}
		}
		return null;
	}
	
	public Customer[] getAllCustomers() {
//		Customer newCustomers[] = new Customer[customersNum];
//		for(int i=0;i<customersNum;i++) {
//			newCustomers[i]=customers[i];
//		}
//		
//		System.arraycopy(customers, 0, newCustomers, 0, customersNum);
//		return newCustomers;
		return customers;
	}
}
