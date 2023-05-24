package com.assignmentAbstractClass;

import com.finalAndAbstractDemo.District;

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
public class MultilevelAbstractDistrict extends Taluka
{
	void show()
	{
		System.out.println(villagePopulation);
	}
	void display()
	{
		System.out.println(talukaPopulation);
	}
	  public static void main(String[] args) {
		  MultilevelAbstractDistrict d = new MultilevelAbstractDistrict();
		  d.display();
		  d.show();
	  }
}
