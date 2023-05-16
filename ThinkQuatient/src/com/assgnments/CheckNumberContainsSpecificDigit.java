package com.assgnments;

import java.util.Scanner;

public class CheckNumberContainsSpecificDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input= sc.nextInt();
		boolean res=false;
		int copy=input;
		while(input>0)
		{
			int dig=input%10;
			if(dig==3)
			{
				res=true;
			} 
			
			input=input/10;
		}
		if(res==true && copy>=1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
