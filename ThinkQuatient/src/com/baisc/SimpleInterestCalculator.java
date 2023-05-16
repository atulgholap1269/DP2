package com.baisc;
import java.util.Scanner;
public class SimpleInterestCalculator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre principal");
		float principal=sc.nextFloat();
		System.out.println("Entre time");
	    float time=sc.nextFloat();
		System.out.println("Entre rate");
		float rate=sc.nextFloat();
		
		float simpleInterest= (principal*time*rate)/100;
		System.out.println("Simple Interest =  "+simpleInterest);
		
		float totalAmount = simpleInterest+principal;
		System.out.println("Amount = "+totalAmount);
		
		sc.close();
		
	}

}
