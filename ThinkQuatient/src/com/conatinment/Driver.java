package com.conatinment;
class Car
{
	  int reg_No;
	  public int id;
	  
}  
public class Driver {
	
	String name;
	Car c;
	public void setCar(Car o)
	{
		c=o;
	}
	
  public static void main(String[] args)
  {
		Driver obj= new Driver();
		Car obj1= new Car();
		obj.setCar(obj1);
		System.out.println(obj);
		System.out.println(obj1);
	}
  }
