package com.constructorAssignment;

public class Account {
	public long accNo;
	public String customerName;
	public Account()
	{
		System.out.println("I am default constructor");
		accNo=123;
		customerName="Atul";
	}
	public Account(long accNo,String customerName )
	{
		System.out.println("I am parametrized constructor");
		this.accNo=accNo;
		this.customerName=customerName;
	}
  public static void main(String[] args) {
	  Account obj = new Account();// if non default constructor present in class then java will not provide default one
	  System.out.println(obj.accNo);
	  System.out.println(obj.customerName);
	  Account obj1 = new Account();
	  System.out.println(obj1.accNo);
	  System.out.println(obj1.customerName);
	  Account obj2 = new Account(345, "Atul Gholap");
	  System.out.println(obj2.accNo);
	  System.out.println(obj2.customerName);
	  Account obj3 = new Account(145, "Atul Banshi Gholap");
	  System.out.println(obj3.accNo);
	  System.out.println(obj3.customerName);
  }
}
