package com.writeenAssignment;

public class SimpleClass {

	
	public static void talk(ISmile ia1)
	{
		System.out.println(":-0");
		ia1.smile();
	}
}
interface ISmile
{
	void smile();
}
class Smile implements ISmile
{
	public void smile()//it is necessary to make method as public while we complete this method in implementation class.
	{
		System.out.println(" :-)");
	}
	void frown() {
		ISmile a1= new Smile();
		a1.smile();
		System.out.println(" :-[ ");
	}
}

