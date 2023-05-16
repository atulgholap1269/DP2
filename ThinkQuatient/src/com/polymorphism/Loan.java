package com.polymorphism;

import java.util.Scanner;

public class Loan {
float principal;
float timeInDays ;
static float interstRate;
static float interestRate1;
   Loan(float principal, float timeInDays,float interstRate, float interestRate1 )
    {
	this.principal=principal;
	this.timeInDays=timeInDays;
	this.interestRate1=interestRate1;
	this.interstRate=interstRate;
    }
  
  public float loan(float interstRate )
  {
  float loan= (principal*interstRate*(timeInDays/360))/100;
  return loan;
  }
  public float loan( float interstRate, float interestRate1 )
  {
	  float loan= (principal*(interstRate+interestRate1)*(timeInDays/360))/100; 
	  return loan;
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal amount:");
	float principal=sc.nextFloat();
	System.out.println("Enter time of loan:");
	float timeInDays=sc.nextFloat();
	System.out.println("Enter interest1:");
	float inerestRate=sc.nextFloat();
	System.out.println("Enter interest2:");
	float inerestRate1=sc.nextFloat();
	Loan obj = new Loan(principal,timeInDays,inerestRate,inerestRate1);
	if(timeInDays<=180)
	{
		System.out.println("interest rate for six month:");
		System.out.println(obj.loan(inerestRate));
		
	}
	else
	{
		System.out.println("interest rate after six month:");
		System.out.println(obj.loan(inerestRate, inerestRate1));
		
	}
	
}
}
