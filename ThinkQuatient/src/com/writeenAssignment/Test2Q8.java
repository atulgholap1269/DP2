package com.writeenAssignment;

import java.util.Scanner;

public class Test2Q8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.println(100/6);
		System.out.println("Enter sales that you have done");
		double sale = sc.nextDouble();
		double res= sale>=15000?(sale*0.05):0.0;
		System.out.println(res);
		
	}

}
