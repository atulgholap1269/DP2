package com.overloading;

public class StaticMethodOverloading {
	
	public static void display()
	{
		System.out.println("Hi");
	}
	public static final void display(int a, int b)//we can use final keyword with static
	{
		System.out.println("hi");
	}
	public static void display(String a, int b)
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		StaticMethodOverloading.display();
		StaticMethodOverloading.display(123,45);
		StaticMethodOverloading.display("Atul", 12);
	}

}
