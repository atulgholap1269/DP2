package com.writeenAssignment;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark;
		do {
		 System.out.println("Enter subject:");
		 String sub=sc.next();
		 System.out.println("Enter Mark:");
		 mark=sc.nextInt();
		 String res=mark>=80?"Distiction":mark<80 && mark>=70?"First Class":mark<70 && mark>=60 && sub.equals("physics")?"Pass": mark<
				 70 && mark>=60 &&sub.equalsIgnoreCase(sub)?"Special Pass":"Fail";
		 System.out.println(res);
		}
		while(mark>0);
		 
	}

}
