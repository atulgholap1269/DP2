package com.assignmentsInheritanceAndPolymorphism;
interface IceCream
{
	void eat();
}
interface Juice
{
	void drink();
}
public class Mastani implements IceCream, Juice
{
	public void eat()
	{
		System.out.println("Icecrean is ready to eat");
	}
	public void drink()
	{
		System.out.println("Juice are ready to drink");
	}
  public static void main(String[] args) 
  {
	Mastani obj = new Mastani();
	obj.drink();
	obj.eat();
  }
}
