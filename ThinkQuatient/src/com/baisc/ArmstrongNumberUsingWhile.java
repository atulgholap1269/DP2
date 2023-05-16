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
	int div;
	while(num1>0)
	{
		div=num1%10;
		count++;
		num1=num1/10;
	}
	System.out.println(+count);
	while(num2>0)
	{
		rem=num2%10;
		//arm=arm+(rem*rem*rem);
		arm=arm+ Math.pow(rem,count);
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
