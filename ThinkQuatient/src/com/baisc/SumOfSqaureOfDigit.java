package com.baisc;

import java.util.Scanner;

public class SumOfSqaureOfDigit {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// if num=5 the sum=1^2+2^2+3^2+4^2+5^2
		System.out.println("Entre number upto which we want add the sqaure of number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0; i<=num;i++)
		{
			sum=(int) (sum+ Math.pow(i,2));
		}
		System.out.println("sum of sqaure of number:"+sum);
	}

}
