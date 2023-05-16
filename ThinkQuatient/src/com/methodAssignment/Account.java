package com.methodAssignment;

public class Account {

	int acc_no;
	String name;
	float amount;
	public void insert(int acc_no, String name,float amount)
	{
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	public void display()
	{
		System.out.println("acc no: "+acc_no);
		System.out.println("name: "+name);
		System.out.println("amount: "+amount);
	}
	public float withrow(float witAmount)
	{
		amount=amount-witAmount;
		return amount;
	}
	public float deposit(float dipositAmount)
	{
		amount=amount+dipositAmount;
		return amount;
	}
	public static void main(String[] args) {
		Account obj = new Account();
		obj.insert(123, "Atul", 50000);
		obj.display();
		obj.deposit(10000);
		obj.display();
	}
}
