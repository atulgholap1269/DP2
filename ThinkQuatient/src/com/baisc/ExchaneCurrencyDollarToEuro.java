 
 package com.baisc;

import java.util.Scanner;

public class ExchaneCurrencyDollarToEuro {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Choose onee from the following option");
		String option;
		do
		 {

		System.out.println("1.USD to Euro");
		System.out.println("2.Euro to USD");
		
		int exchange = sc.nextInt();
		switch(exchange)
		{
		case 1:
		{
			System.out.println("Entre the number of USD");
			double USD=sc.nextDouble();
			if(USD>=0)
			{
				System.out.println(USD+"USD is "+(USD*0.781162)+"Euro");
			}
			else
			{
				System.out.println("Please positive number");
			}
			
		}
		break;
		case 2:
		{
			System.out.println("Entre the number of Euro");
			double Euro= sc.nextDouble();
			if(Euro>=0)
			{
				System.out.println(Euro+" Euro is "+(Euro/0.781162)+"Dollar");
			}
			else
			{
				System.out.println("Please positive number");
			}
		}
		break;
		}
		
		System.out.println("continue?yes or no");
		option=sc.next();
		
		
		}
		while(option.equalsIgnoreCase("yes"));
	}
}
	


