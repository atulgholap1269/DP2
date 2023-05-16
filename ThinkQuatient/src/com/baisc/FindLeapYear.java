package com.baisc;

import java.util.Scanner;

public class FindLeapYear {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre year");
		int year= sc.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("it is not leap year");
		}
	}

}
