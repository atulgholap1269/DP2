package com.baisc;

import java.util.Scanner;

public class FindPowerOfGivenBaseAndIndex {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre the base");
		int base =sc.nextInt();
		System.out.println("Entre the exponent");
		int expo =sc.nextInt();
		int pow=1;
		//int i=1;
		/*while(i<=expo)
		{
			pow=pow*base;
			i++;
		}
		System.out.println(+pow);*/
		//using for loop
		for(int i=1;i<=expo;i++)
		{
			pow=pow*base;
		}
		System.out.println(+pow);
	}

}
