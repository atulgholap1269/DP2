package com.xobin;

import java.util.Scanner;

public class Test3Q2 {
	public static void main(String[] args) {
		//Write java programme to generate numbers of the following series up to given number
		// 1  3  7  15  31  63
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number up to which you want to run series");
		int input = sc.nextInt();
		int ans=1;
		//System.out.print(ans+" ");
		for(int i=1;i<=input; i=(2*i)+1) 
		{
			
			System.out.print(i+" ");
//			ans=ans*2+1;
//			if(ans>input)
//			{
//				break;
//			}
//			System.out.print(ans+" ");
		}
	}

}
