package com.assgnments;

import java.util.Scanner;

public class NoOfChoclateGet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your rupees to buy choclate");
		int rupees=sc.nextInt();
		int choclate=0;
		for(int i=1;i<=rupees;i++)
		{
			choclate++;
			if(choclate%3==0)
			{
				choclate++;
			}
			
		}
		System.out.println("Boy gets "+choclate+" choclate in "+rupees+" rs");
	}

}
