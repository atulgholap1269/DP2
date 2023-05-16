package com.methodAssignment;

public class CalculateCube{
	int cube;
	int num=5;
 public void calculateCube()
 {
	 cube =num*num*num;
	 System.out.println("Cube of "+num+"is : "+cube);
 }
  public void calculateCube(int num)
  {
	  cube =num*num*num;
	  System.out.println("Cube of "+num+"is : "+cube);
  }
  
  public int calculateCube1(int num)
  {
	  cube =num*num*num;
	  return cube;
  }
  public static void main(String[] args) {
	  CalculateCube obj = new CalculateCube();
	  obj.calculateCube();
	  obj.calculateCube(5);
	  System.out.println(obj.calculateCube1(10));
}
}
