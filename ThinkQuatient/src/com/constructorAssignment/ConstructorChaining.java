package com.constructorAssignment;


public class ConstructorChaining {
	
	ConstructorChaining()
	{
		
		System.out.println("first constructor");
	}
	ConstructorChaining(String id)
	{
		this();
		System.out.println("second constructor");
	}
	ConstructorChaining(String id, String name)
	{
		
		this("Atul");
		System.out.println("third constructor");
	}
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining("Atul", "Gholap");
		
	}

}
