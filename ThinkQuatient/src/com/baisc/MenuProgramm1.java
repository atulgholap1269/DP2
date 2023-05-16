package com.baisc;

import java.util.Scanner;

public class MenuProgramm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the radius");
		int radius=sc.nextInt();
		System.out.println("Entre length");
		int length=sc.nextInt();
		System.out.println("Entre height");
		int height=sc.nextInt();
		
		char ch;
		do
		{
			
			System.out.println("1. circlearea \n 2.rectanglearea\n 3.trainglearea\n 4.CircumCircle\n 5.PerimeterRec");
			System.out.println("Entre your choice");
			int choice=sc.nextInt();
			
		switch(choice)
		{
		case 1:System.out.println("circlearea="+(3.14*radius*radius));
		break;
		case 2:System.out.println("rectanglearea="+(length*height));
		break;
		case 3:System.out.println("trainglearea="+(0.5*length*height));
		break;
		case 4:System.out.println("Circumference="+(2*3.14*radius));
		break;
		case 5:System.out.println("periRec="+(2*length+2*height));
		break;
		default:System.out.println("invalid choice");
		}
		System.out.println("Do you want to continue......");
		ch=sc.next().charAt(0);
		
		}
		while(ch=='y'||ch=='Y');
}
}