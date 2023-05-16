package com.baisc;

import java.util.Scanner;

public class NestedIfDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre your age");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("entre your bmi");
		float bmi=sc.nextFloat();
		if(bmi>=18 && bmi<=25)
		{
			System.out.println("you can donate blood");
		}
		else
		{
		  System.out.println("you can not donate blood");
		}
	}
	else
	{
		System.out.println(" you are  not eligible to donate blood");
	}
}
}
