package com.superDemo;

class Mobile
{
	String memory;
	public Mobile(String memory)
	{
		this.memory=memory;
	}
	public void calling()
	{
		System.out.println("Mobile use for calling");
	}
}
class Apple extends Mobile
{
	String memory;
	public Apple(String memory)
	{
		super("128GB");// super() also use to access the superclass constructor but it statement must be in first line in method
		this.memory=memory;
	}
	public void showApple()//super keyword use acces superclass instance variable
	{
		System.out.println(memory+ " "+super.memory);
	}
	public void calling()
	{
		System.out.println("Apple is for whatsapp calling");
		super.calling();//if we want super class instance method 
	}
}

public class AccessSuperClassVariable {
	public static void main(String[] args) {
		Apple obj = new Apple("256GB");
		obj.showApple();
		obj.calling();//calling method get override by apple implementation
	}

}
