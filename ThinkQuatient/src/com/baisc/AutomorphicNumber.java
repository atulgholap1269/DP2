package com.baisc;
import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any number");
		int num = sc.nextInt();
		int copyNum=num;
	
		int  sqaureOfNum=num*num;
		int div=1;
		while(num>0)
		{
			div=div*10;
			num=num/10;
		}
		int lastDigit=sqaureOfNum%div;
		
		if(copyNum==lastDigit)
		{
			System.out.println("automorphic number");
		}
		else
		{
			System.out.println("Not automorphic number");
		}
		
		
		
	}

}
