package com.assignmentSuper_this;

public class Student {
	int id;
	String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
		
	}
	public static void main(String[] args) {
		Student obj= new Student();
		Student obj1= new Student();
		obj.setId(11);
		obj1.setId(21);
		System.out.println(obj.getId());
		System.out.println(obj1.getId());
		//this.id=30;we cannot use this in static method
				
	}

}
