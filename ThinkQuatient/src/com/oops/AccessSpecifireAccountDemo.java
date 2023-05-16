package com.oops;

public class AccessSpecifireAccountDemo {
	public int acno;
	public String name;
	public  float balance;
	
	public void openAccount()
	{
		fillCustomerDetails(12345,"Atul",8264);
	}
	private void fillCustomerDetails(int acn, String n, int b)
	{
		acno=acn;
		name=n;
		balance=b;
	}
	public void showCustomerDetails()
	 {
		 System.out.println("Customer name : "+name);
		 System.out.println("Account no : "+acno);
		 System.out.println("Account Balance : "+balance);
		 
	 }
	 
  
}
