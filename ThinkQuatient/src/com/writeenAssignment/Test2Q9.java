 package com.writeenAssignment;

import java.util.Scanner;

public class Test2Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("enter your sex");
		char sex = sc.next().charAt(0);
		System.out.println("enter your maritial status");
		char status= sc.next().charAt(0);
		if(sex=='F')
		{
			System.out.println("She will work only in urban areas");
		}
		else if(sex=='M'&& age>20 && age<=40)
		{
			System.out.println("he may work in anywhere");
		}
		else if(sex=='M'&& age>40 && age<60)
		{
			System.out.println("he will work only in urban areas");
		}
		else
		{
			System.out.println("ERROR");
		}
		
		
		 
	}

}
