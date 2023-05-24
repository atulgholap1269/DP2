package com.containmentAssignment;
class Student
{
	int roll;
	String name;
	public Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
	}
}
public class Department {
int id;
String name;
public Department(int id, String name)
{
	this.id=id;
	this.name=name;
}
public static void main(String[] args) {
	Student obj= new Student(12, "Atul");
	Department obj1 = new Department(23, "Atul");
	System.out.println(obj.name);
	System.out.println(obj.roll);
	System.out.println(obj1.id+" "+obj1.name);
}
}
