package com.overriding;

class Animal
{
	public void run()
	{
		System.out.println("Animal is running...");
	} 
	public static void run(String a)//we can override overloaded method.
	{
		System.out.println("Animal eat both veg and nonveg");
	}
	public Animal show()
	{
		return new Animal();
	}
}
class Vehical
 {
	public  Number getNum()
	{
		return 67;
	}
}
class Dog extends Animal
{
	@Override
	public void run()
	{
		System.out.println("Dog is running...");
	}
	public static void run(String a)//we can overload overriden method
	{
		System.out.println("Dog eat both veg and nonveg");
	}
	public Dog show()
	{
		System.out.println("dog is runnung");
		return new Dog();
	}
	
	
}
class Car extends Vehical
{
	public Double getNum() //in overriding return type must be same or its covariant type of superclass.
	{
		return 12.67;
	}
}
public class OverrideDemo extends Dog {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.run();
		d.run("Atul");
		Animal a=new Dog();//Dynamic method dispatching
		a.run();
		Vehical v = new Vehical();
		
		
		
		
	}

}
