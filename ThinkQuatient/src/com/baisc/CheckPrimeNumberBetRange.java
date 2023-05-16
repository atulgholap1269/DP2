package com.baisc;

import java.util.Scanner;

public class CheckPrimeNumberBetRange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entre minimum value");
		int min=sc.nextInt();
		System.out.println("entre max value");
		int max=sc.nextInt();
		int count;
		for( int i=min;i<=max;i++)
		{
			count=0;
			for( int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i+",");
			}
			
		}
		
	}

}
