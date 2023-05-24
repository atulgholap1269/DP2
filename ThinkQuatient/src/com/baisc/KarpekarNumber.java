package com.baisc;

import java.util.Scanner;

public class KarpekarNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sq=num*num;
		int lengthOfNum=0;
	    int copyNum=num; 
		int div=1;
		//if 9^2=81 then 8+1=9 i.e,num=9;
		while(num>0)
		{
			div=div*10; 
			num=num/10;
		}
		System.out.println(div);
		num=copyNum;
	    int lastDigit=sq%div;
	    int firstdigitOfSq=sq/div;
		System.out.println(lastDigit);
		System.out.println(firstdigitOfSq);
		int sumOfSqDigit=firstdigitOfSq+lastDigit;
		if(num==sumOfSqDigit)
		{
			System.out.println("karpekar number");
		}
		else
		{
			System.out.println("Not karpekar number");
		}
			
	}

}
