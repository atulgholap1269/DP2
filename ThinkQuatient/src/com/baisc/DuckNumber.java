package com.baisc;

import java.util.Scanner;

public class DuckNumber {
	void checkDuckNumber(String num)
	{
		
		char ch =num.charAt(0);
		int count=0;
		//if first digit of number contain 0 then condition becomes true and it shows it is not duck number
		if(ch=='0')
		{
			System.out.println("it is not duck number");
		}
		//if first Digitis not 0 then it will come to else 
		else
		{
			 
			for(int i=1; i<num.length();i++)
			{
				if(num.charAt(i)=='0')
				{
					count++;
				}
			}
		}
		if(count==1)
		{
			System.out.println("duck number");
		}
		else
		{
			System.out.println("It is not duck number because\neighter conatin 0 at begining"
					+ " or\ncount of 0 is greater than 1");
		}
	}
	public static void main(String[] args)
	{
		DuckNumber obj= new DuckNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		String num= sc.nextLine();
		obj.checkDuckNumber(num);
	}

}
