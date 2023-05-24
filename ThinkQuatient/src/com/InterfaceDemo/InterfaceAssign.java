package com.InterfaceDemo;

interface movable 
{ 
	int a=10;
	void run();
}
abstract class Fun implements movable
{

	public abstract void display();
}
public class InterfaceAssign extends Fun {
	
 public void run()
 {
	  System.out.println("Boy is running");
 }
 public void display()
 {
	System.out.println("Show me your notebook"); 
 }
 public static void main(String[] args) {
	 InterfaceAssign obj = new InterfaceAssign();
	 obj.run();
	 obj.display();
	 System.out.println("Square of numbeber: "+(a*a));
}
}
