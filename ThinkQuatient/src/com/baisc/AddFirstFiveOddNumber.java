package com.baisc;

import java.util.Scanner;

public class AddFirstFiveOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number ");
		int n=sc.nextInt();
		int sumOfOdd=0;
		   for(int i=1;i<n*2;i++)
		   {
			   if(i%2!=0)
			   {
				   sumOfOdd=sumOfOdd+i;
			   }
				   
		   }
	  System.out.println(sumOfOdd);
		}
			
		
		
	


}
