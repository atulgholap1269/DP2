package com.assignmentAbstractClass;
abstract class WAJP2
{
	public abstract void cook();
	public void wash()
	{
		 System.out.println("wash");
	}
}
public class Child extends WAJP2
{
	 public void cook()
	{
			System.out.println("cook");	 
	}
	 public static void main(String[] args) {
		 Child obj = new Child();
		 obj.cook();
		 obj.wash();
	}
}

