package com.writeenAssignment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre first number");
		int num1= sc.nextInt();
		System.out.println("Entre second number");
		int num2= sc.nextInt();
		char ch;
		int result;
		do {
			System.out.println("Select menu \"+\" \"-\" \"*\" \"/\" ");
			
			String menu=sc.next();
			
		switch(menu)
		{
		case "+" :result=num1+num2;
		System.out.println("Addition is: "+result);
		break;
		case "-" :result=num1-num2;
		System.out.println("Substrction is: "+result);
		break;
		case "*" :result=num1*num2;
		System.out.println("Multipication is: "+result);
		break;
		case "/" :result=num1/num2;
		System.out.println("Division is: "+result);
		break;
		default:System.out.println("Incorrect Selection");
		}
		System.out.println("Do you want to continue");
		 ch = sc.next().charAt(0);
		}
		while(ch=='y'|| ch=='Y');
	}

}
