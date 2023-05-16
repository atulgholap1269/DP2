package com.baisc;

import java.util.Scanner;

public class TwinPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre first number");
		int num1=sc.nextInt();
		System.out.println("Entre second number");
		int num2=sc.nextInt();
		int cnt1=0,cnt2=0;
		for(int i=2;i<num1;i++)
		{
			if(num1%i==0)
			{
				cnt1++;
			}
		}
		for(int i=2;i<num2;i++)
		{
			if(num2%i==0)
			{
				cnt2++;
			}
		}
		int diff=Math.abs(num1-num2);
		if(cnt1==0&&cnt2==0&&diff==2)
		{
			System.out.println("twin prime number");
		}
		else
		{
			System.out.println("numbers are not prime number");
		}
		
	}

}
