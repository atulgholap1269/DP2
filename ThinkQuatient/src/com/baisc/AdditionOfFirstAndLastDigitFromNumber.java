package com.baisc;

import java.util.Scanner;

public class AdditionOfFirstAndLastDigitFromNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre any number");
	int num = sc.nextInt();
	int lastDigit=num%10;
	int copy=num;
	int div=1;
	while(num>=10)
	{
		div=div*10;
		num=num/10;
	}
	int firstDigit=copy/div;
	System.out.println("Addition of two number is : "+(firstDigit+lastDigit));
}
}
