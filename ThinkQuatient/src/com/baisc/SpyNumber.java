 package com.baisc;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any number");
		int num=sc.nextInt();
		int product=1;
		int copyNum=num;
		int sum=0;
		//number whoose addition of digit is equal to product of digit
		// num=123 1+2+3=1*2*3
		while(num>0)
		{
			int digit =num%10;
			product=product*digit;
			sum=sum+digit;
			num=num/10;
		}
		if(product==sum)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("it is not spy number");
		}
	}

}
