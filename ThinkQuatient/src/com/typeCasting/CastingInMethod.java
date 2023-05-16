package com.typeCasting;

public class CastingInMethod {
	public int m1(int n)
	{
		System.out.println("Done");
		return n;
	}
public static void main(String[] args) {
	long x=101;
	CastingInMethod t= new CastingInMethod();
	System.out.println(t.m1((int)x));
	
}
}
