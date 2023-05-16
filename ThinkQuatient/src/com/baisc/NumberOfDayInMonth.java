package com.baisc;
import java.util.Scanner;
public class NumberOfDayInMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre month number");
		int monthNumber = sc.nextInt();
		/*if(monthNumber==1)
		{
			System.out.println("Jan = 31 days");
		}
		else if(monthNumber==2)
		{
			System.out.println("Feb = 28 days");
		}
		else if(monthNumber==3)
		{
			System.out.println("March = 31 days");
		}
		else if(monthNumber==4)
		{
			System.out.println("April = 30 days");
		}
		else if(monthNumber==5)
		{
			System.out.println("May = 31 days");
		}
		else if(monthNumber==6)
		{
			System.out.println("June = 30 days");
		}
		else if(monthNumber==7)
		{
			System.out.println("July = 31 days");
		}
		else if(monthNumber==8)
		{
			System.out.println("Agust = 31 days");
		}
		
		else if(monthNumber==9)
		{
			System.out.println("Sep = 30 days");
		}
		else if(monthNumber==10)
		{
			System.out.println("October = 31 days");
		}
		else if(monthNumber==11)
		{
			System.out.println("November = 30 days");
		}
		else if(monthNumber==12)
		{
			System.out.println("December = 31 days");
		}
		else 
		{
			System.out.println("Invalid input");
		}*/
		switch(monthNumber)
		{
		case 1: System.out.println("Jan = 31 days");
		break;
		case 2: System.out.println("Feb = 28 days");
		break;
		case 3: System.out.println("March = 31 days");
		break;
		case 4: System.out.println("April = 30 days");
		break;
		case 5: System.out.println("May = 31 days");
		break;
		case 6: System.out.println("June = 30 days");
		break;
		case 7: System.out.println("July = 31 days");
		break;
		case 8: System.out.println("Agust = 31 days");
		break;
		case 9: System.out.println("September = 30 days");
		break;
		case 10: System.out.println("october = 31 days");
		break;
		case 11: System.out.println("november = 30 days");
		break;
		case 12: System.out.println("December = 31 days");
		break;
		default:System.out.println("Invalid entry");
		}
		
		
	}

}
