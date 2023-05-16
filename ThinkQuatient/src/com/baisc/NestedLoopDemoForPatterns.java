package com.baisc;

public class NestedLoopDemoForPatterns {
	public static void main(String[] args) {
		//for sqaure patter
		/*for(int i=1;i<=3;i++)
		{
			
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		//for traingle pattern
		//*
		//**
		//***
		//****
		/*for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		//revrese traingle
	//*****
	//****
	//**
	//*
		/*for(int i=5;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		//to print character
		//A
		//AB
		//ABC
		//ABCD
		/*for(char i='A';i<='D';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		//******
		//*    *
		//*    *
		//*    *
		//******
		for(int i=0;i<=5;i++) //row
		{
			for(int j=0; j<=5;j++)
			{
				if(i==0 ||j==5 ||i==5||j==0)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		//DCBA
		//DCB
		//DC
		//D
		/*for(char i='A';i<='D';i++)
			
		{
			for(char j='D';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		//1
		//23
		//456
		//78910
    /* int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}*/
		//ABCD
		//ABC
		//AB
		//A
		/*for(char i ='D';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
