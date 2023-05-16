package com.baisc;

import java.util.Scanner;

public class TotalNumberOfDigit {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre any number");
	int num= sc.nextInt();
	int count=0;
	int rem;
	while(num>0)
	{
		//rem=num%10;
		count++;
		num=num/10;
	}
	System.out.println("Count of digit is "+count);
	}
}
