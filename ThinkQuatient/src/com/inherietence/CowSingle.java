package com.inherietence;
class Animal
{
	String infoanimal="Animal are both veg and nonveg";
	public void show()
	{
		System.out.println(infoanimal);
	}
}
public class CowSingle extends Animal{
  String cowInfo="Cow is vegeteiran";
  public void showCow()
  {
	  System.out.println(cowInfo);
  }
  public static void main(String[] args) {
	  CowSingle obj = new CowSingle();//using cow object we can fetch Animal properties
	  obj.show();
	  obj.showCow();

 
  } 
}
