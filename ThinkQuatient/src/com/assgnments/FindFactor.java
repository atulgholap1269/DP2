package com.assgnments;

import java.util.Scanner;

public class FindFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num!=0)
		{
		for(int i=1;i<=Math.abs(num);i++)
		{
			if(num%i==0)
			{
				System.out.print(i+",");
	
			}
		}
	}
		else
		{
			System.out.println("no factors");
		}
	}

}
