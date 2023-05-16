package com.staticUse;

import java.util.Scanner;

public class Account {
	static float intrestRate=10;
      
    public double simpleInterest(double amount, int years)
    {
    	double simpleIntrest=((amount*years*intrestRate)/100);
    	System.out.print("Simple Intrest:");
    	return simpleIntrest;
    }
    public double compoundIntrest(double amount, int years)
    {
    	System.out.println();
    	double compoundIntrest=(amount*(Math.pow((1+(intrestRate/100)), years)))-amount;
    	System.out.print("Compound Intrest:");
    	return compoundIntrest;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your loan amount");
		int amount=sc.nextInt();
		System.out.println("Enter number years that you want to take loan");
		int years= sc.nextInt();
		Account obj= new Account();
		System.out.println(obj.simpleInterest(amount, years));
		System.out.println(obj.compoundIntrest(amount, years));
		
		
	
	}
}
