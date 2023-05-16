 package com.assgnments;

import java.util.Scanner;

public class Assign2 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Meenu age: ");
	int age= sc.nextInt();
	int coin=0;
	
	switch(age)
	{
	case 1:
		coin=coin+(1*1*1);
		System.out.println("Meenu get "+coin+"coin");
		
	break;
	
	case 2:coin=coin+(2*2*2);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 3:coin=coin+(3*3*3);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 4:coin=coin+(4*4*4);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 5:coin=coin+(5*5*5);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 6:coin=coin+(6*6*6);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 7:coin=coin+(7*7*7);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 8:coin=coin+(8*8*8);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 9:coin=coin+(9*9*9);
		System.out.println("Meenu get "+coin+"coin");
	break;
	case 10:coin=coin+(10*10*10);
		System.out.println("Meenu get "+coin+"coin");
	break;
	default:System.out.println("Invalid age");
	}
}
}
