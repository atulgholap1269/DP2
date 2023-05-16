package com.oppsAssignment;

import java.util.Scanner;

public class NationalGame {
	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner (System.in);
	char ch;
	do {
    System.out.println("Enter country name");
    String country =sc.next();
    switch (country)
    {
    case "India" :System.out.println("Hocky");
    break;
    case "China" : System.out.println("Table Tennis");
    break;
    case "Bangladesh" :System.out.println("Kabaddi");
    break;
    case"United States" : System.out.println("baseball");
    default:System.out.println("invalid input");
   
    }
    System.out.println("Do you want to know another country national game");
    System.out.println("enter Y for continue:");
    ch=sc.next().charAt(0);
	}
	while (ch=='y'||ch=='Y');
	}
}
