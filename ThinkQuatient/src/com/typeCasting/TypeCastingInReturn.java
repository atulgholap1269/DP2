package com.typeCasting;

public class TypeCastingInReturn {
    public int calculate(double x,int y)
    {
    	return (int)(x+y);
    }
    public static void main(String[] args) {
		long x=101;
		TypeCastingInReturn obj=new TypeCastingInReturn();
		System.out.println(obj.calculate(4.5, 4));
	}
}
