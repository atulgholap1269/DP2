package com.assgnments;

import java.util.Scanner;

public class Assign4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the key digit");
		int key=sc.nextInt();
		int count=0;
		int copyNum=num;
		while(num>0)
		{
			int dig=num%10;
			if(key==dig)
			{
				count++;
			}
			num=num/10;
		}
		
		System.out.println(+key+" appears "+count+" times in "+copyNum);
	}

}
