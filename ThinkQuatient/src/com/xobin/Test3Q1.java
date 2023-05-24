  package com.xobin;

import java.util.Scanner;

public class Test3Q1 {
	public static void main(String[] args) {
		
		//write java programme to generaye first 100 terms of following series 
		//1 2 4 7 11 16 22 29 upto 100 term.
		//Accept  the position of a number in seires from user, find the number in seires at that position
		Scanner sc = new Scanner(System.in);
		System.out.println("enter term up to which you want print series:");
		int num=sc.nextInt();
		int add=1;
		for(int i=1; i<=100; i++)
		{
			add=add+(i-1);
			if(i==num)
			{
				System.out.println(add);
			}
		
		}
		 
	}

}
