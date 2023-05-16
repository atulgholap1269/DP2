package com.baisc;

import java.util.Scanner;

public class NtermsFactorialSum {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre number of term");
	int term =sc.nextInt();
	int fact;
	int sumOfFact=0;
	for(int i=1;i<=term;i++)
	{
		fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
			
		}
		sumOfFact=sumOfFact+fact;
	}
	System.out.println(sumOfFact);
	
	}
}
