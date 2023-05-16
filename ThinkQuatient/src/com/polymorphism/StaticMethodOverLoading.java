package com.polymorphism;
class OverLoad{
	 static int a=10;
	 int b=10;
	 
	 public void displayA()
	 {
		 System.out.println(a);
	 }
	public static void display()
	{
		System.out.println(a);
	}
	public static void display(int a)
	{
		//displayA();
		OverLoad.display();
	//	System.out.println(b); static method cannot allow nonstatic member
	}
	public static void display(int a, int b)
	{
		OverLoad.display(1);
		System.out.println("is");
	}
	public static void display(String a, int b)
	{
		OverLoad.display(1,4);
		System.out.println("Atul");
	}
	
}

public class StaticMethodOverLoading extends OverLoad{
	public static void main(String[] args) {
		
		OverLoad.display("1",3);
		StaticMethodOverLoading.main(12);
		StaticMethodOverLoading obj= new StaticMethodOverLoading ();
		
	}
	public static void main(int args)
	{
		System.out.println("Atul");
	
	}
}
