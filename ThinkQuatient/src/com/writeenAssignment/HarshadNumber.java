package com.writeenAssignment;

import java.util.Scanner;

public class HarshadNumber {
	int sum=0;
	public void checkHarshad(int num)
	{
		int copy =num;
		while(num>0)
		{
			int dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		num=copy;
		if(num%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
		{
			System.out.println("Not Harshad Number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num1=sc.nextInt();
		HarshadNumber obj = new HarshadNumber();
		obj.checkHarshad(num1);
	}
}
