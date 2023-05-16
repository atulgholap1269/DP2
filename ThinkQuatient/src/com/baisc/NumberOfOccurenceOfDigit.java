package com.baisc;

import java.util.Scanner;

public class NumberOfOccurenceOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any number");
		int num=sc.nextInt();
		
		int copyNum=num;
		for(int i=0; i<=9; i++)
		{
			int count=0;
			while(num>0)
			{
			  int digit =num%10;
			  if(i==digit)
			  {
				count++;
		      }
			  num=num/10;
			}
			num=copyNum;
			if(count>0)
			{
			System.out.println(i+" "+count);
			}
		 }
		
}
}