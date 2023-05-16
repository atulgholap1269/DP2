package com.baisc;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int noOfTerms, term1, term2, nextTerm;
		Scanner sc =new Scanner(System.in);
		boolean repeat=true;
		while(repeat) {
		System.out.println("Entre number of terms");
		noOfTerms=sc.nextInt();
		
		term1=0;
		term2=1;
		System.out.println(term1);
		System.out.println(term2);
		//using for loop
		for(int i=3;i<=noOfTerms;i++)
		{
			nextTerm=term1+term2;
			System.out.println(nextTerm);
			term1=term2;
			term2=nextTerm;
		}
		System.out.println("continue:? yes or no");
		String answer=sc.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			repeat=true;
		}
		else
		{
			repeat=false;
		}
		}
		//using do while loop
		/*int i=3;
		do
		{
			nextTerm=term1+term2;
			System.out.println(+nextTerm);
			term1=term2;
			term2=nextTerm;
			i++;
		}
		while(i<=noOfTerms);*/
		
		
		//using while loop
		/*int i=1;
		while(i<=noOfTerms)
		{
			System.out.println(term1+",");
			nextTerm=term1+term2;
			term1=term2;
			term2=nextTerm;
			i++;
		}*/
	}

}
