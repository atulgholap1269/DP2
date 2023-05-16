package com.baisc;

import java.util.Scanner;

public class averageMarksOfStudent {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	double sum;
	int numberOfStudent;
	double next;
	String answer;
	System.out.println("This programme average of non negative marks of student");
	 
	do
	{
		System.out.println("Entre all subject marks");
		System.out.println("Entre negative number after you have entered all subject marks");
		//initializing the variable
		sum=0;
		numberOfStudent=0;
		//entre first score
		next=sc.nextDouble();
		while(next>0)
		{
			//add score to sum
			sum=sum+next;
			//increment number of student
			numberOfStudent++;
			//entree second score
			next=sc.nextDouble();
		}
		if(numberOfStudent>0)
		{
			System.out.println("Average marks is:"+(sum/numberOfStudent));
		}
		else
		{
			System.out.println("No scorares to average");
		}
		System.out.println("Want to average another subject marks" );
		System.out.println("Entre yes or no");
		answer =sc.next();
	}
	while(answer.equalsIgnoreCase("yes"));
	
	}
}
