package com.baisc;

import java.util.Scanner;

public class LadderLoopDemo {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Entre any number");
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println("positive number");
	}
	else if(num<0)
	{
		System.out.println("negative number");
	}
	else
	{
		System.out.println("number is zero");
	}
}
}
