package com.baisc;

import java.util.Scanner;

public class ShoppingMall {
public static void main(String[] args) {
	float totalBill;
	float disBill;
	float discount;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre total Amount :");
	totalBill=sc.nextFloat();
	if(totalBill>=10000)
	{
		discount =(0.4f*totalBill);
		disBill=totalBill-(0.4f*totalBill);
	}
	else if(totalBill>=5000)
	{
		discount =(0.3f*totalBill);
		disBill=totalBill-(0.3f*totalBill);
	}
	else if(totalBill>=2000)
	{
		discount =(0.2f*totalBill);
		disBill=totalBill-(0.2f*totalBill);
	}
	else
	{
		discount =(0.1f*totalBill);
		disBill=totalBill-(0.1f*totalBill);
	}
	System.out.println("====================================");
	System.out.println("Total Bill = "+totalBill);
	System.out.println("Discount amount = "+discount);
	System.out.println("Amount you have to pay = "+disBill);
}

}
