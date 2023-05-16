package com.writeenAssignment;

import java.util.Scanner;

 
public class MagicNumber {
	static int num=536;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		while(true) 
		{
		
		int num1= sc.nextInt();
		if(num1>num)
		 {
			 System.out.println("guess lower number");
		 }
		 else if (num1<num)
		 {
			 System.out.println("guess higher number");
		 }
		 else
		 {
			 System.out.println("both number are same");
			 break;
		 }
		
		}
		
	}

}
