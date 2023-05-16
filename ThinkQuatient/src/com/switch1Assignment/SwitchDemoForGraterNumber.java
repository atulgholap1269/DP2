package com.switch1Assignment;

import java.util.Scanner;

public class SwitchDemoForGraterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre first number");
		int num1= sc.nextInt();
		System.out.println("Entre second number");
		int num2= sc.nextInt();
		//using ternary operator we find maximum number
		int res=num1>num2?1:0;// if result=1,num1 is grater|| result=0, num2 is greater
		System.out.println(res);
		switch(res)
		{
		case 0:
			res=num1==num2?1:0;// res =0 , num2 is greater|| res=1, both num are equal
			System.out.println(res);
		    switch(res)
		    {
		    case 0:System.out.println("grater nukmber is "+num2);
		    break;
		    case 1 :System.out.println("both number are equal");
		    break;
		    }
		    break;
		case 1:System.out.println("grater number is "+num1);
		break;
		}
	
	}

}
