package com.methodAssignment;

public class CalculateSqaure {
	public void calculateSqaure(int num)
	{
		System.out.println("Sqaure of number: "+num*num);
	}
	public int calculateSqaure1(int num1)
	{
		int sq=num1*num1;
		return sq;
	}
	public static void main(String[] args) {
		CalculateSqaure obj = new CalculateSqaure();
		obj.calculateSqaure(5);
		System.out.println(obj.calculateSqaure1(10));
	}

}
