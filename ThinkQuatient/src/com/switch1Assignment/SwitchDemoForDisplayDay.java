package com.switch1Assignment;

import java.util.Scanner;

public class SwitchDemoForDisplayDay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		int day = sc.nextInt();
		
		
		switch(day)
		{
		case 1:
			 System.out.println("today is monday");
			 break;
		case 2:
			 System.out.println("today is tuesday");
			 break;
		case 3:
			 System.out.println("today is wedensday");
			 break;
		case 4:
			 System.out.println("today is thursday");
			 break;
		case 5:
			 System.out.println("today is friday");
			 break;
		case 6:
			 System.out.println("today is saturday");
			 break;
		case 7:
			 System.out.println("today is Sunday");
			 break;
		default:
			 System.out.println("Day does not exist");
			 
			 
		}
		
	}

}
