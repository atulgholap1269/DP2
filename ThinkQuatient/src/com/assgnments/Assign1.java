package com.assgnments;

import java.util.Scanner;

public class Assign1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		char ch;
		do {
		System.out.println("Enter the car number: ");
		int carNum=sc.nextInt();
        int copyCarNum=carNum;
        int count=0;
        int sum=0;
        while(carNum>0)
        {
        	int dig=carNum%10;
        	sum=sum+dig;
        	count++;
        	carNum=carNum/10;
        }
        if(count==4)
        {
        	 if(sum%3==00 || sum%5==0|| sum%7==0)
             {
             	System.out.println("Lucky Number");
             }
             else
             {
             	System.out.println("Sorry its not lucky number");
             	System.out.println("Do you want to try another number");
             	System.out.println("enter Y for continue");
             	
             }
        }
        else
        {
        	System.out.println("Number is not valid");
        	System.out.println("Do you want to try another number");
         	System.out.println("enter Y for continue");
        }
        
       
        ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
	}

}
