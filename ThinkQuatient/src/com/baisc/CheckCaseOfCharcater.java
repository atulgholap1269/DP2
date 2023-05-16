package com.baisc;

import java.util.Scanner;

public class CheckCaseOfCharcater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre any character");
		char ch =sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Character is uppercase");
		}
		else if(ch>='a'&& ch<='z')
		{
			System.out.println("Charcter is lowercase");
		}
		else
		{
			System.out.println("no alphabet");
		}
	}

}
