package BankApplication.BankingApplication;

import java.util.Scanner;

class Customer{
	 
	private String ename;
	private int id;
	static Scanner sc=new Scanner(System.in);
	public void enter() {
		System.out.print("Enter Customer Name :");
		ename =sc.next();
		System.out.print("Enter Customer ID :");
		id=sc.nextInt();
	}
	public void display() {
		System.out.println("Name of the customer :"+ename);
		System.out.println("id of the customer : "+id);
	}
	public static void update(int id,Customer customer[]) {
		int n1=getId(id,customer);
		System.out.println("Enter the updated name ");
		customer[n1].ename=sc.next();
		customer[n1].display();
		
	}
	public static int getId(int id,Customer[] customer) {
		for(int i=0;i<customer.length;i++) {
			if(id==customer[i].id) {
				return i;
			}
		}
		return 0; 
	}
	public static int getName(String name,Customer[] customer) {
		for(int i=0;i<customer.length;i++) {
			if(name==customer[i].ename) {
				return i;
			}
		}
		return 0;
	}
	public static void getDetails(String name,Customer customer[]) {
		int n=getName(name,customer);
		customer[n].display();
	}
	public static void asc(Customer[] customer) {
		int n;
		for(int i=0;i<customer.length;i++) {
			n=i;
			
		}
	}
	
	
}
public class BankingApp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of employess you want to enter: ");
		int n=sc.nextInt();
		Customer customer[]=new Customer[n];

		for(int i=0;i<n;i++) {
			customer[i]=new Customer();
			customer[i].enter();
		}
		
	int ch;
	System.out.println("Enter Your Choice:");
	
	System.out.println("Enter 1 for all records");
	 System.out.println("Enter 2 for delete");
	 System.out.println("Enter 3 for update");
	 System.out.println("Enter 4 for Search by name");
	 System.out.println("Enter 5 for sort ASC");
	 System.out.println("Enter 6 for sort DESC");
	 System.out.println("Enter 7 for Exit");
	 ch=sc.nextInt();
	 switch(ch) {
	 case 1:
		 for(int i=0;i<customer.length;i++) {
			 customer[i].display();
		 }
		 break;
	 case 2:
		 
		 break;
	 case 3:
	 {
		 System.out.println("Enter the id you want to update ");
		 int num=sc.nextInt();
		 Customer.update(num,customer);
		 
		 
		 
		 break;
	 }
	 case 4:
	 {
		 System.out.println("Enter the name you want to search");
		 String name=sc.next();
		 Customer.getDetails(name,customer);
		 break;
	 }
	 case 5:
		 Customer.asc(customer);
		 break;
	 }
	
	

}
}

