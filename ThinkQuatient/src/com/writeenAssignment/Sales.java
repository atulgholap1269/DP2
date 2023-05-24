package com.writeenAssignment;

import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sales amount:");
		 float sale= sc.nextFloat();
		 if(sale>2000)
		 {
			 float commission=(sale*5)/100;
			 System.out.println(commission);
		 }
		 else
		 {
			 System.out.println("you will not get any commission");
		 }
		
	}

}
