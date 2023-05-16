package com.khadijaMamAss;

public class Cycle {
  int accountNo;
  int noOfWheels;
   Cycle() 
   {
	   System.out.println("I am default constructor");
   }
   Cycle(int accountNo, int noOfWheels) 
   {
	   this();
	   System.out.println("I am another constructor");
   }
   public static void main(String[] args) {
	   Cycle obj = new Cycle();
	   Cycle obj1 = new Cycle(1234, 4);
}
	
}
