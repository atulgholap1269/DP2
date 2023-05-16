package com.assignmentOnStaticAndFinal;

import java.util.Scanner;

class ParentClass
{
	static int parent=10;
	public static void display()
	{
		System.out.println(parent);
	}
}
public class StaticMethodInheritance extends ParentClass {
	
	public void sumOfIntegers()
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("enter number");
		int next = sc.nextInt();
	   while(next>0) {
		  
		sum=sum+next;
		System.out.println("sum = "+sum);
		System.out.println("enter number");
		next = sc.nextInt();
	   }
	  
	 
		   
	   }
	
	public static void main(String[] args) {
		System.out.println(parent);// we can inherit staic variable from parent class into sub class.
		display();// we can also inherit static method from parent class into subclass.
		StaticMethodInheritance obj = new StaticMethodInheritance();
				obj.sumOfIntegers();
	}

}
