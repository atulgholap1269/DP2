package com.finalAndAbstractDemo;
 class Parent
{
	public final void show()
	{
		System.out.println("parent");
	}
}
 final class GrandFather
 {
	 
 }
// class child extends GrandFather 
// {
//	 we cannot inherit final class.
// }
public class FinalDemo2 extends Parent{
//	public void show()  we can override fianl method
//	{
//		
//	}
	public void display()
	{
		super.show();// we can use super keyword to call super class method
	}
	
	

}
