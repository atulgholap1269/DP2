package com.baisc;

import java.util.Scanner;

public class DisplayTableOfGivenNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre number for table");
	int num=sc.nextInt();
	System.out.println("table of "+num+"given as :");
	for(int i=1;i<=10;i++)
	{
		
		System.out.println(+num*i);
	}
	
}
}
