package com.assgnments;

import java.util.Scanner;

public class CovertDaysInToYerasMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number od days");
		int days=sc.nextInt();
		int year=days/365;
		int rem=days%365;
		int month=rem/30;
		   rem=rem%30;
		   days=rem;
		   System.out.println("years:"+year);
		   System.out.println("Months:"+month);
		   System.out.println("days:"+days);
	}
	
	

}
