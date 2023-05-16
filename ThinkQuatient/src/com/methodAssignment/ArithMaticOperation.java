package com.methodAssignment;

public class ArithMaticOperation {
 
	public int add(int num1, int num2)
	{
		int add=num1+num2;
		return add;
	}
	public int sub(int num1, int num2)
	{
		int sub=num1-num2;
		return sub;
	}
	public int mul(int num1, int num2)
	{
		int mul=num1*num2;
		return mul;
	}
	public int div(int num1, int num2)
	{
		int div=num1/num2;
		return div;
	}
	public static void main(String[] args) {
		ArithMaticOperation obj = new ArithMaticOperation();
		System.out.println(obj.add(45, 55));
		System.out.println(obj.sub(60, 20));
		System.out.println(obj.mul(5, 15));
		System.out.println(obj.div(50, 5));
	}
}
