package com.inherietence;
class Springs
{
	public void springsInfo()
	{
		System.out.println("Raining water moves to Springs");
	}
}
class River extends Springs
{
	public void riverInfo()
	{
		System.out.println("Springs moves to River");
	}
}
public class SeaMulti extends River {
	public void seaInfo()
	{
		System.out.println("River moves to Sea");
	}
   public static void main(String[] args) {
	   SeaMulti obj = new SeaMulti();// Sea class contain both Springs and River properties
	   obj.springsInfo();
	   obj.riverInfo();
	   obj.seaInfo();
}
}
