package com.baisc;

import java.util.Scanner;

public class SwapNumberWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre first number");
		int num1= sc.nextInt();
		System.out.println("Entre second number");
		int num2= sc.nextInt();
		System.out.println("number before swaping");
		System.out.println("num1:"+num1+" & num2:"+num2);
		num1=num1+num2;//if num1=10 num2=5 now num1=15
		num2=num1-num2;//num2=10;
		num1=num1-num2;//num1=5
		System.out.println("number after swaping");
		System.out.println("num1:"+num1+" & num2:"+num2);
	}

}
