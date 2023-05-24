package com.baisc;

import java.util.Scanner;

public class TriomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number");
		int num=sc.nextInt();
		long cube=num*num*num;
		long lastDigitOfCube=0;
		int count=0;
		int copyNum=num;
		int div=1;
		while(num>0)
		{
			div=div*10;
			num=num/10;
		}
		num=copyNum;
		
	
		 lastDigitOfCube=cube%10;
		 
		 if(num==lastDigitOfCube)
			{
				System.out.println("TriomorphicNumber");
			}
			else
			{
				System.out.println("it is not TriomorphicNumber");
			}
		 
	
		
	}

}
