package com.baisc;

import java.util.Scanner;

public class AddFirstFiveOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number ");
		int n=sc.nextInt();
		int copyNum=n;
	    double arm=0; 
	    int rem;
	    int count=0;
	    while(n>0)
	    {
	    	count++;
	    	n=n/10;
	    }
	    n=copyNum;
	    while(n>0)
	    {
	    	rem=n%10;
	    	arm=(double)arm+Math.pow(rem, count);
	    	n=n/10;
	    }
	if(arm==copyNum)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("not armstrong number");
	}
	
	
			
		
		
	}


}
