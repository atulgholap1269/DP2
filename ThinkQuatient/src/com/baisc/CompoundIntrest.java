package com.baisc;

import java.util.Scanner;

public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre principal");
		float principal=sc.nextFloat();
		System.out.println("Entre time");
	    float time=sc.nextFloat();
		System.out.println("Entre rate");
		float rate=sc.nextFloat();
		float rateCal=1+(rate/100);
		float ratePower=1;
		for(int i=1;i<=time;i++)
		{
			ratePower=ratePower*rateCal;
		}
		float compoundIntrest= (principal*ratePower)-principal;
		System.out.println("compound intrest is "+compoundIntrest);
	}

}
