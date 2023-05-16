package com.baisc;

public class StarPatternDemo1 {
	public static void main(String args[]) {
	     
		//*   *
		//** **
		//*****
		//** **
		//*   *
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			for(int k=i+1;k<=4;k++)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			for(int k=i+1;k<=4;k++)
			{
				System.out.print("  ");
			}
			for(int l=i;l>=1;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
}
