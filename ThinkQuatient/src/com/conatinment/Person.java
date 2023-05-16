package com.conatinment;
 class Add
 {
	 int pincode;
	 String city;
	 public Add(int pincode, String city)
	 {
		this.pincode =pincode;
		this.city=city;
	 }
	 public String toString()
	 {
		 return pincode+ " " +city+" ";
	 }
 }
public class Person {
	int pid;
	String name;
	Add ad;
	public Person(int pid, String name, Add ad)
	{
		this.pid=pid;
		this.name=name;
		this.ad=ad;
	}
	public String toString()
	{
		return"name: "+name+" id: "+pid+ad;
	}
	public static void main(String[] args) {
		
	
	Person obj=new Person(12, "Atul", new Add(414305, "Alkuti"));
    System.out.println(obj);
    
	}   
}
