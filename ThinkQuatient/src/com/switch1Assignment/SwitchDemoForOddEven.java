package com.switch1Assignment;

import java.util.Scanner;

public class SwitchDemoForOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any number");
		int num= sc.nextInt();
		switch(num%2)
		{
		case 1: System.out.println(num+" is odd number");
		break;
		default:System.out.println(num+" is even number");
		}
	}
}
