package com.assgnments;

import java.util.Scanner;

public class Assign5 {
	
	public static void main(String[] args) {
	    
		final int pin=1234;
		Scanner sc=new Scanner(System.in);
		int balance=1000;
		char ch;
		
		int withrowAmount;
		
		int count=0;
		int flag=0;
		  
		while(count<3)
		{
			System.out.println("Welcome Atul....");
			System.out.println("Enter your pin:");
			int enterPin=sc.nextInt();
			if(enterPin==pin)
			{
				flag=1;
				break;
			}
			else
			{
				count++;
				System.out.println("You have enters wrong password "+count+" times \n you have "+(3-count)+"more attempts are reamaing");
			}
		}
		
		
		
	if(flag==1) {
		do {	
		System.out.println("Select your choice:/n 1.Deposite /n 2.Withrow / n3.Check Balance /n4.exit");
		System.out.println("enter N for extit");
		int option=sc.nextInt();
			
		switch(option)
		{
		
		case 1:
			   System.out.println("Enter amount for deposit:");
			   
		       int depositAmount=sc.nextInt();
		       balance=balance+depositAmount;
		       System.out.println("Updated balance is:"+balance);
		       break;
		case 2:System.out.println("Enter amount for Withrow:");
		        withrowAmount=sc.nextInt();
		        if(withrowAmount<balance)
		        {
		           balance=balance-withrowAmount;
		           System.out.println("Updated balance is:"+balance);
		        }
		        else
		        {
		        	System.out.println("Your balance is not enough");
		        }
	           break;
	           
		case 3:System.out.println("Updated balance is:"+balance);
		       break;
		       
		case 4:System.out.println("Thanks!");
		}
	  
		
		   System.out.println("Do you want to continue.....");
		   ch=sc.next().charAt(0);
		}
		while((ch=='y'||ch=='Y'));
		
	}
	else
	{
		System.out.println("You have entered incorrect pin 3 times\nPlease contact you home branch");
	}
		
	}

}
