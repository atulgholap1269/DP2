 package com.baisc;

import java.util.Scanner;

public class PrimeNumberWithinNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number");
		int num=sc.nextInt();
		boolean res;
		
		while(num>0)
		{
			int dig=num%10;
			
			res=true;
			for(int i=2;i<dig;i++)
			{
				if(dig%i==0)
				{
					res=false;
					
				}
			}
			num=num/10;
			if(res==true)
			{
				System.out.println(dig+" is prime number");
			}
		}
	}

}
