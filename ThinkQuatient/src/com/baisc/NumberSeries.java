package com.baisc;

import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre number of term");
		int num=sc.nextInt();
		int copy=num;
		int rem,pal=0;
		while(num>0)
		{
			 rem=num%10;
			pal=rem+(pal*10);
			num=num/10;
		}
		if(pal==copy)
		{
			System.out.println("palindrom number");
		}
		else
		{
			System.out.println("not palindrom number");
		}
	}

}
