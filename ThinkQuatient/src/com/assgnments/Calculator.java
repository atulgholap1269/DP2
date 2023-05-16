package com.assgnments;

public class Calculator {
	public int addition(int a,int b)
	{
		int add = a+b;
		return add;
	}
	public int substraction(int a,int b)
	{
		int sub = a-b;
		return sub;
	}
	public int multipication(int a,int b)
	{
		int mul = a*b;
		return mul;
	}
	public int division(int a,int b)
	{
		int div = a/b;
		return div;
	}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		 System.out.println(obj.addition(12, 45));
		 System.out.println(obj.substraction(50, 45));
		System.out.println(obj.multipication(5, 5));
		System.out.println(obj.division(50, 5));
		
	}

}
