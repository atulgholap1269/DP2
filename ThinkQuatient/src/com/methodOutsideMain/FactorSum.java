package com.methodOutsideMain;

import java.util.Scanner;

public class FactorSum {
	
	public int findSum(int num)
	{
		int sum=0;
		for(int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				System.out.print(i+",");
			}
		}
		return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		FactorSum obj= new FactorSum();
		System.out.println("sum= "+obj.findSum(8));
	}
}
