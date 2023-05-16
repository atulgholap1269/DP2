package com.oops;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;
	int age;
	Employee(int id,String name,int salary, int age)
	
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	void showDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
	void  getBonus()
	{
		if(age>=60)
		{
			System.out.println("salary is "+salary+5000);
			
		}
		else if(age>=40)
		{
			salary=salary+2000;
			System.out.println("salary is "+salary);
			
		}
		else
		{
			salary=salary+2000;
			System.out.println("no bonus only salary");
		}
		
	}
	public static void main(String s[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter salary");
		int salary=sc.nextInt();
		System.out.println("Enter age");
		int age=sc.nextInt();
		Employee obj = new Employee(id, name, salary,age);
		
		
		obj.showDetails();
		obj.getBonus();
		
	}

}
