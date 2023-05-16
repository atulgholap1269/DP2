package com.baisc;

import java.util.Scanner;

public class MenuProgramme {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre the first  number");
	int num1=sc.nextInt();
	System.out.println("Entre the seconf  number");
	int num2=sc.nextInt();
	
	char ch;
	do
	{
		System.out.println("Entre your choice");
		System.out.println("1.addition \n 2.substraction\n 3.Multipication \n 4.division");
		int choice=sc.nextInt();
		
	switch(choice)
	{
	case 1:System.out.println("Addition="+(num1+num2));
	break;
	case 2:System.out.println("Sustraction="+(num1-num2));
	break;
	case 3:System.out.println("Multipication="+(num1*num2));
	break;
	case 4:System.out.println("Divsion="+(num1/num2));
	break;
	default:System.out.println("invalid choice");
	}
	System.out.println("Do you want to continue......");
	ch=sc.next().charAt(0);
	
	}
	while(ch=='y'||ch=='Y');
	
}
}
