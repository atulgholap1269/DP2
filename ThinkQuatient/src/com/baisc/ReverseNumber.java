package com.baisc;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Entre any number");
	int num= sc.nextInt();
	int rev;
	while(num>0)
	{
		rev=num%10;
		System.out.print(+rev);
		num=num/10;
	}
}
}
