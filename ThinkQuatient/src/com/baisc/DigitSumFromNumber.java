package com.baisc;

import java.util.Scanner;

public class DigitSumFromNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any number");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(+sum);
	}

}
