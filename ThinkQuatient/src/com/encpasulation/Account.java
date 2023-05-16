package com.encpasulation;

public class Account {
	private int acno;
	private String name;
	private float balance;
	

	public void setAcno(int acno)
	{
		this.acno=acno;
	}
	public void setName(String name)
	{
		this.name=name; 
	}
	public void setBalance(Float balance)
	{
		this.balance=balance;
	}
	public int getAcno()
	{
		return acno;
	}
	public float getBalance()
	{
		return balance;
	}
	public String getName()
	{
		return name;
	}
	public void acceptAccountDetails(int acno, String name, float balance)
	{
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}
	

}
