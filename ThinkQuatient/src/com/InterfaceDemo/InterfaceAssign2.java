package com.InterfaceDemo;
interface Calcutabel
{
	public int factor(int a);
	public void display();
	default void  show() {
		System.out.println("Default method in first interface");
	}
}
interface Calcutable2
{
	public void display();
//	default void  show() {
//		System.out.println("Default method in second interface");
//	}
	
}
public class InterfaceAssign2 implements Calcutabel,Calcutable2 {

	public void display()
	{
		System.out.println("override interface incomplete method");
	}
	public void  show() {
		System.out.println("Override Default method in class");
	}
	public int factor(int a)
	{
		int sum=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			   sum=sum+i;
			}
		}
		return sum;
	}
   public static void main(String[] args) {
	   InterfaceAssign2 obj = new InterfaceAssign2();
	   System.out.println( obj.factor(10));
	   obj.display();
	   obj.show();
	   Calcutabel c1=new InterfaceAssign2();
	   c1.show();
	  
	  
}
	
}
