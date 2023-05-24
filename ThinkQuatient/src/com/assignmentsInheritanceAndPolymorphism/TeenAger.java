package com.assignmentsInheritanceAndPolymorphism;
class Kid
{
	void readBook()
	{
	 System.out.println("nonparametrized method");
	}
	void readbook(int a, int b)
	{
		System.out.println("Parameterized method");
	}
}
class BigKid extends Kid
{
	void readBook()
	{
		System.out.println("Implemented readBook in BigKid");
	}
}
public class TeenAger extends Kid
{
 void readBook()
 {
	 System.out.println("Implemented readBook in TennAger");
 }
 public static void main(String[] args) {
	Kid k1;
	Kid k2;
	k1= new BigKid();
	k2= new TeenAger();
	k1.readBook();
	k1.readBook();
	
}
}
