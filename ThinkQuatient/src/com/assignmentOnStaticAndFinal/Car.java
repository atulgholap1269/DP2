package com.assignmentOnStaticAndFinal;

public class Car {
	static String model="2008";
	static String inTotalCarSold="50";
	int a=50;// non-static means instance
	
	public static void display(int a)
	{
		System.out.println("single parameterized static method");
	}
	public  static void display(int a, int b)// Access Specifier and static, non-static is not make effect on overloading.
	{
		System.out.println("double parameterized static method");
	}
	public void display()
	{
		System.out.println(a);//non-static method can access non-static variable
		System.out.println(model);//non-static method can also access static variable.
	}
	public static void main(String[] args) {
		Car.model="2011";
		Car.inTotalCarSold="55";
		System.out.println(model);
		System.out.println(inTotalCarSold);
		Car obj =new Car();
		obj.model="2012";
		obj.inTotalCarSold="60";
		
		Car obj1= new Car();//When change value of static variable from two object then it will create two instances of static variabl]
		obj1.model="2013";
		System.out.println(obj1.model);
		System.out.println(obj.model);
		System.out.println(obj1.inTotalCarSold);
	
		//System.out.println(a); static method can not access instance variable implicitely
		System.out.println(model);// static method can access static variable.
		
		
	}
}
