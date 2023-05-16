package com.baisc;

import java.util.Scanner;

public class CheckCharCase {
public static void main(String[] args) {
	Scanner sc  =new Scanner(System.in);
	System.out.println("Entre charcter");
	char ch = sc.next().charAt(0);
	
	if(ch>='A'&& ch<='Z')
	{
		System.out.println("uppercase");
	}
	else if(ch>='a'&& ch<='z')
	{
		System.out.println("lowercase");
	}
	else if(ch=='0'&& ch=='9')
	{
		System.out.println("Digit");
	}
	else
	{
		System.out.println("special case");
	}
}
}