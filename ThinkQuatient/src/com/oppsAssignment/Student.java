package com.oppsAssignment;

import java.util.Scanner;

public class Student {
	int marks1;
	String name;
	void studentDetails(int mark, String name1 )
	{
		marks1=mark;
		name=name1;
	}
	void displayDetials()
	{
		System.out.println(marks1);
		System.out.println(name);
	}
	Scanner sc = new Scanner(System.in);
	int id=sc.nextInt();//for every new object it will ask the value
	
public static void main(String[] args) {
	
	Student s= new Student();
	//s.marks1=87;
	//System.out.println(s.marks1);
	Student s1= new Student();
	//Student s2= new Student();

	//boolean result=true;
	//Object myObject=new Object(); You can creat anonymous object during instantiation by storing the instance with var keyword
   // var myObject1= new Object();
	s.studentDetails( 67,"Atul");
	s.displayDetials();
	//object with two differnt var have differnt hash code it means it creat two memory iside heap
	System.out.println(s1);
	System.out.println(s);
	s1=s;//it represnt that now both object uses same memory. so there hashcode also same
	System.out.println(s1);
	System.out.println(s);
	s.id=99;
	System.out.println(s.id);
	//s1.id=90;
	//s2.id=90;
	System.out.println(s1.id);
	System.out.println(s.id);
    System.out.println(s1.marks1);
}
}