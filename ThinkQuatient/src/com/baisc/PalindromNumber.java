package com.baisc;

import java.util.Scanner;

public class PalindromNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Entre any number");
	int num= sc.nextInt();
	int rem, pal=0;
	int num1=num;
	while(num>0)
	{
		rem=num%10;
		pal=rem+(pal*10);
		num=num/10;
	}
	if(num1==pal)
	{
		System.out.println("palindrom number");
	}
	else
	{
		System.out.println("not plaindom");
	}
}
}
