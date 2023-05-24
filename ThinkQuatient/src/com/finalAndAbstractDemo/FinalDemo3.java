package com.finalAndAbstractDemo;
 class Vehical 
 {
	 final int a=10;
	 final int b;
	 final int c;
	 final static int d=10;
	 {
		 b=10;//initialize block
	 }
	 public Vehical()
	 {
		 c=20; // we can initialize final variable in constructor but at once.
	 }
	 final static void show()
	 {
		 System.out.println(d);
	 }
	 
 }
 class Car extends Vehical
 {
	 
//	 final static void show() error we can not override final method as well as static method
//	 {
//		 
//	 }
 }
public class FinalDemo3 extends Vehical{
	public static void main(String[] args) {
		Vehical v= new Vehical();
		System.out.println(v.a);
		System.out.println(v.d);
		System.out.println(v.c);
	}

}
