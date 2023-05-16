package com.useOfThis;

public class UseOfThisWithConstructor {
	UseOfThisWithConstructor()
	{
		
		System.out.println("first constructor");
	}
	UseOfThisWithConstructor(String id)
	{
		this();
		System.out.println("second constructor");
	}
	UseOfThisWithConstructor(String id, String name)
	{
		
		this("Atul");
		System.out.println("third constructor");
	}
	public static void main(String[] args) {
		UseOfThisWithConstructor obj= new UseOfThisWithConstructor("Atul","Gholap");
	}
}
