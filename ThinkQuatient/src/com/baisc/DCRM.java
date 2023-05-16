package com.baisc;

import java.util.Scanner;

public class DCRM {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre number");
		int num=sc.nextInt();
		int count=0;
		int count1=0;
		int sum=0;
		// if n=89 then 8^1+9^2=89 then it is DCRM number
		int copyNum=num;
		while(num>0)
		{
			count++;
			count1++;
			num=num/10;
		
		}
		num=copyNum;
		while(num>0 && count1>=2)
		{
			int digit=num%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*digit;
			}
			sum=sum+pow;
			count--;
			num=num/10;
		}
		if(sum==copyNum)
		{
			System.out.println("DCRM number");
		}
		else
		{
			System.out.println("not DCRM number");	
		}
		
	}

}
