package com.assignmentOnStaticAndFinal;
 class SuperClass
 {
	 static int a=50;
	 public static void display(int a)
	 {
		 System.out.println("Hi");
	 }
	 public final void make()
	 {
		 System.out.println("Final method in super class");
	 }
	 private void cake()
	 {
		 System.out.println("Private method");
	 }
 }
 final class FinalDemoChild
 {
	 // final class can not be inherited
 }

public class FinalDemo extends SuperClass {
	final int x=10;
	final int y;
	//y=10; we have to initialize final variable at the time of declaration 
	// or w=you can initialize it inside the constructor or initializer block
	{
	//	x=10;error you cannot reinitialize final variable even inside the initializer block or constructor
		y=20;
	}
//	public FinalDemo()
//	{
//		x=20;
	//y=30; error you can not re-initialize it second time;
//	}
	public static void display(int a)
	{
		
		System.out.println("Single parametrize display override method");
	}
//	public final void make()
//	{
//		  can not override final method from super class
//	}

	public void show()
	{
		SuperClass.a=60;
	}
	public static void main(String[] args) {
		
		final int z;//in method you can initialize it after declaration
		z=10;
		//z=30; error but you can initialize it only once
		//obj.x=30; error final filed x can not be reinitialized
		FinalDemo obj = new FinalDemo();
		obj.make();// we can inherit final method of super class but we can not override it
		//obj.cake() error private method is not visible to other classes
	}

}
