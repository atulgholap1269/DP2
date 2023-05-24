package com.baisc;

import java.util.Scanner;

public class HarshatNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre any number");
		int num=sc.nextInt();
		int sum=0;
		
		while(num>0)
		{
			int dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		if(num%sum==0)
		{
			System.out.println("harshat number");
		}
	}

}
