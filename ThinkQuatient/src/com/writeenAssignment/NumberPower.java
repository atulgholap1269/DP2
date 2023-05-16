package com.writeenAssignment;

import java.util.Scanner;

public class NumberPower {
	int count=0;
	long pow=1;
	public long findPower(int num)
	{
		int copy=num;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=copy;
		for(int i=1;i<=count;i++)
		{
			 pow=pow*num;
		}
		return pow;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num1=sc.nextInt();
		NumberPower obj = new NumberPower();
		System.out.println("Print number size power of input number: ");
		System.out.println(obj.findPower(num1));
	}

}
