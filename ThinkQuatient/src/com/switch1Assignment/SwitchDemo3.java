package com.switch1Assignment;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre first number");
		int num1=sc.nextInt();
		System.out.println("entre second number");
		int num2=sc.nextInt();
         System.out.println("1.Addition");
         System.out.println("2.Substraction");
         System.out.println("3.Multipication");
         System.out.println("4.Division");
         System.out.println("Entre the choice from above menu");
         
         int choice = sc.nextInt();
         switch(choice)
         {
         case 1:System.out.println("Addition = "+(num1+num2));
         break;
         case 2:System.out.println("Substraction = "+(num1-num2));
         break;
         case 3:System.out.println("Multipication = "+(num1*num2));
         break;
         case 4:System.out.println("Division = "+(num1/num2));
         break;
         default : System.out.println("Invalid choice");
         }
		}
}
