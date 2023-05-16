package com.baisc;

import java.util.Scanner;

public class NumberSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre number of term");
		int num=sc.nextInt();
		int terms;
		for(int i=1;i<=num;i++)
		{
			terms=1;
			terms=terms*(i*i)+(i*i*i);
			System.out.print(terms+",");
		}
	}

}
