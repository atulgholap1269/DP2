package com.baisc;

import java.util.Scanner;

public class GreaterNumberFromThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
		System.out.println("Entre first number");
	    int num1= sc.nextInt();
		System.out.println("Entre second number");
		int num2= sc.nextInt();
		System.out.println("Entre third number");
		int num3= sc.nextInt();
		
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(+num1+" is greater");
		}
		if(num2>num1 && num2>num3)
		{
			System.out.println(+num2+" is greater");
		}
		else
		{
			System.out.println(+num3+" is greater");
		}
		System.out.println("Do you want to continue");
		str=sc.next();
	}
		while(str.equalsIgnoreCase("yes"));
	}

}
