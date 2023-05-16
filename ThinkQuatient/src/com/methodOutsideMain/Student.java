package com.methodOutsideMain;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	public int getId()
	{
		int id=123;
		return id;
	}
	public void displayData(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	void setCustomerData(int customId, String customName)
	{
		//observe your values are overwritten in id and name insstance variable.
		//it is not overwritten.
		int id=customId;
		String name=customName;
	}
	public void objPass(Student obj1)
	{
		this.id=456;
		System.out.println(obj1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        //System.out.println("enter id:");
        //int id=sc.nextInt();
        System.out.println("enter name:");
        String name=sc.next();
        Student obj =new  Student();
       //1.call method from object
       //2.call getId() from displayData();
       //3.call
		obj.displayData(obj.getId(),name);//
		obj.setCustomerData(345, "Gholap");
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.objPass(obj);
		System.out.println(obj);
		System.out.println(obj.id);//value of id change as per objPass() method
	}

}
