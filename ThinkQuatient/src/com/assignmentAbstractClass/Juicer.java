package com.assignmentAbstractClass;
abstract class Machine
{
	public void rotate()
	{
		System.out.println("Machine have rotating shaft");
	}
	abstract void crush();
}
abstract class s
{
	
}
abstract class Mixer extends Machine
{
	void crush()
	{
		System.out.println("Mixer use to crush apple");
	}
	public void blend()
	{
		System.out.println("blender use in mixer");
	}
}
public class Juicer extends Mixer {
	void crush()
	{
		System.out.println("Juicer use to crush apple");
	}
	public void filter()
	{
		System.out.println("filter the juice");
	}
	public static void main(String[] args) {
		Juicer obj = new Juicer();
		obj.crush();
		obj.filter();
		obj.filter();
//		Machine m= new Juicer();
//		m.crush();
//		m.rotate();
		Mixer mx= new Juicer();
		mx.crush();
		mx.blend();
		mx.rotate();
		
	}
}

//a. Can we create an object of an abstract class?
//Ans: NO
//		
//b. Can we declare a class abstract with no methods in it? 
//Ans:yes
//c. Can we declare a class abstract even if it does not have any abstract 
//method? 
//Ans: yes
//d. Can we declare an abstract class which has both abstract as well as 
//implemented methods?
//Ans: Yes
//e. Can a class extend 2 or more abstract classes?
//Ans: No
//f. Can an abstract class extend 2 or more abstract classes?
// Ans:No
//g. Can an interface extend 1 or many abstract classes?
//ans:no
//h. Can an abstract class implements 1 or many interface?
// abstract class implements many interface.
