package com.baisc;

import java.util.Scanner;

public class DiscountProblemOfMall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float discBill;
		char card;
		System.out.println("Entre your total bill");
		float totalBill=sc.nextFloat();
	
		if(totalBill>5000)
		{System.out.println("Do you have a Pv card");
		card = sc.next().charAt(0);
		if(card=='y'||card=='Y')
		{
			discBill= (totalBill-(0.3f*totalBill));
			
		}
		else
		{
			discBill=(totalBill-(0.2f*totalBill));
			
		}
			
		}
		else
		{
			discBill=(float) (totalBill-(0.05*totalBill));
			System.out.println("discount="+discBill);
		}
		System.out.println("============================");
		System.out.println("Total bill ="+totalBill);
		System.out.println("Discounted Amount = "+(totalBill-discBill));
		System.out.println("Amount you have to pay = "+discBill);
		
		
	}

}
