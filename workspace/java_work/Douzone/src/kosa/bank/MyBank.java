package kosa.bank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyBank implements Serializable{
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
	
	public void saveCustomers() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("customers.txt"));
			oos.writeObject(customers);;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
	public void loadCustomers() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("customers.txt"));
			customers = (Customer[])ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
	
}
