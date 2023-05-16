package com.baisc;

import java.util.Scanner;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount,dollars,qauters,dims, nickels, pennies;
		final int Dollar =25;
		final int Dime =10;
		final int Nickel =5;
		final int Penney =1;
		System.out.println("Entre Whole number : ");
		amount = sc.nextInt();
		System.out.println(amount+" cent in coin can be given as :");
		
		qauters=amount / Dollar;
		System.out.println(qauters+" dollar");
        amount =amount % Dollar;
        
        dims=amount / Dime;
		System.out.println(dims+" dime");
        amount = amount % Dime;
        
        nickels=amount / Nickel;
		System.out.println(nickels+" nickel");
		amount = amount % Nickel;
        
        
        pennies=amount;
		System.out.println(pennies+" penney");
        
	}

}
