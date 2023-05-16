package com.baisc;

import java.util.Scanner;

public class MagicNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=56;
		int count=0;
		while(true)
		{
			System.out.println("entre any number");
			int n=sc.nextInt();
			count++;
			if(n>num)
			{
				System.out.println("number greater than magic number");
			}
			else if(n<num)
			 {
					System.out.println("number less than magic number");
			 }
			 else
			 {
				 System.out.println("number is same as magic number");
				 System.out.println("you guessed right number in "+count+" attempts");
				 break;
			 }
		}
	}

}
