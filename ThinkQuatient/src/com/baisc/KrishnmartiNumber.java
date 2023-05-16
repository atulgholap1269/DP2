package com.baisc;

import java.util.Scanner;

public class KrishnmartiNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("entre number");
		int num=sc.nextInt();
		int fact;
		int copyNum=num;
		int krishnamurti=0;
		
		int digit; 
		//if num is 145 the if 1!+4!+5!=145 then it is krishnmurti number
		while(num>0)
		{
			digit =num%10;
			fact=1;
			for(int j=1;j<=digit;j++)
			  {
				fact=fact*j;	
			   }
			krishnamurti=krishnamurti+fact;
			num=num/10;
			
  		   }
			if(krishnamurti==copyNum)
			{
				System.out.println("krishnamurti number");
			}
			else
			{
				System.out.println("not krishnamurti number");
			}
	}

}
