package com.assignmentSuper_this;

public class Cycle {
  int accountNo;
  int noOfWheels;
  public Cycle()
  {
	  System.out.println("I am default constructor");
  }
  public Cycle(int accountNo, int noOfWheels )
  {
	  this();
	  System.out.println("I am another constructor");
	  this.accountNo=accountNo;
	  this.noOfWheels=noOfWheels;
  }
  public static void main(String[] args) {
	Cycle obj = new Cycle();
	Cycle obj1= new Cycle(1234, 4);
}
}
