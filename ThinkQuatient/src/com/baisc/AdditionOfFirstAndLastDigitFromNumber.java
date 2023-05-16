package com.baisc;

import java.util.Scanner;

public class AdditionOfFirstAndLastDigitFromNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre any number");
	int num = sc.nextInt();
	int lastDigit=num%10;
	int firstDigit=num;
	while(firstDigit>=10)
	{
		firstDigit=firstDigit/10;
	}
	System.out.println("Addition of two number is : "+(firstDigit+lastDigit));
}
}
