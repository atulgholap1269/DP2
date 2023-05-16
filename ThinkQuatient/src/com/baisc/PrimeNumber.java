package com.baisc;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre number");
		int num=sc.nextInt();
		/*int i=2;
		int count=0;
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
			
		}
		if(count> =1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
			
		*/
		
		int i=2;
		boolean isprime=true;
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
			
		}
		if(isprime==true)
		{
			System.out.println(" prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
