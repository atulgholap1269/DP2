package com.accessModifire;

public class SuperClass {
   private void son()
   {
	   System.out.println("I am boy");
   }
   void parent()
   {
	   System.out.println("I am father");
   }
   protected void uncle()
   {
	   System.out.println("I am uncle");
   }
   public void grandFather()
   {
	   System.out.println("I am grandfather");
   }
   public static void main(String[] args) {
	   SuperClass obj=new SuperClass();
	   obj.son();//private properties can access in same class
	   obj.parent();// default properties can access in same class 
	   obj.uncle();	// protected properties can access in same class. 
	   obj.grandFather();// public properties can access in same class.
}
}
