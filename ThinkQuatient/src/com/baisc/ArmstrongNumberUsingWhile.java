package com.baisc;

import java.util.Scanner;

public class ArmstrongNumberUsingWhile {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Entre any number");
	int num= sc.nextInt();
	double arm=0,rem;
	int num1=num;
	int num2=num;
	int count=0;
	
	double pow;
	while(num1>0)
	{
		count++;
		num1=num1/10;
	}
	
	while(num2>0)
	{
		rem=num2%10;
	
		pow=1;
		for(int i=1;i<=count;i++) {
		
		   pow =(pow*rem);
		}
	
		arm=arm+pow;
		num2=num2/10;
	}
	if(num==arm)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not Armstrong");
	}
}
}
