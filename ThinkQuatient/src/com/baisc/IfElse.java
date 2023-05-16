package com.baisc;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre your age :");
		int age= sc.nextInt();
		if(age>=18)
		{
			System.out.println("you can vote");
		}
		else
		{
			System.out.println("you cannot vote");
		}
	}

}
