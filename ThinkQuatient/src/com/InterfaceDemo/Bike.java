package com.InterfaceDemo;
interface Vehical
{
	public void show();
	default void display()
	{
		System.out.println("Bike is Vehical");
	}
}
interface TwoWheeler extends Vehical
{
	public void show();
	default void display()// we can not give same default method in both interface and implements in one child class
	{                    //You have extend one interface to another and override the default method then you can implements both interface one child class 
		System.out.println("Bike is TwoWheeler");
	}
}
public class Bike implements Vehical, TwoWheeler
{
  public void show()
  {
	  System.out.println("Bike is vehical");
  }
  public static void main(String[] args) {
	  Vehical obj= new Bike();
	  obj.show();
	  TwoWheeler obj1= new Bike();// with the help of interface we can achieve multiple inheritance like structure
	  obj1.show();
	  obj1.display();// interface default method must be ov
}
}
