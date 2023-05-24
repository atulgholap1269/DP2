package com.finalAndAbstractDemo;
abstract class Village 
{
	int villagePopulation=7000;
	abstract void show();
	
}
abstract class Taluka extends Village
{
	final int talukaPopulation=10000;
	//abstract void show();
	abstract void display();
}
public class District extends Taluka {

	void show()
	{
		System.out.println(villagePopulation);
	}
	void display()
	{
		System.out.println(talukaPopulation);
	}
  public static void main(String[] args) {
	  District d = new District();
	  d.display();
	  d.show();
}
}
