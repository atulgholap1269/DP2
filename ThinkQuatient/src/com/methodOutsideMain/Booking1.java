package com.methodOutsideMain;

import java.util.Scanner;

public class Booking1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter coupan");
		int coupan=sc.nextInt();
		System.out.println("Choose movie to watch:\n1.RRR\n2.KGF2\n3.Puspha");
		int choice=sc.nextInt();
		System.out.println("Do you have any coupan?\nif yes. Enter coupan code.\nelse enter 0:");
		int coupanChice=sc.nextInt();
		sc.close();
		
		switch(choice)
		{
		case 1:Movie1 obj = new Movie1(123,"RRR",300);
		System.out.println("Hello!"+"\nYour ticket price is Rs"+obj.discount(coupan)+"\nEnjoy your Show!");
		break;
		
		case 2:Movie1 obj1 = new Movie1(123,"KGF",350);
		System.out.println("Hello !"+"\nYour ticket price is Rs"+obj1.discount(coupan)+"\nEnjoy your Show!");
		break;
		case 3:Movie1 obj2 = new Movie1(123,"Puspha",280);
		System.out.println("Hello !"+"\nYour ticket price is Rs"+obj2.discount(coupan)+"\nEnjoy your Show!");
		break;
		}
	    
	}

}
