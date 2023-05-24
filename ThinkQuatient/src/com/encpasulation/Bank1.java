package com.encpasulation;

import java.util.Scanner;

public class Bank1  {
	public static void main(String[] args) {
		Paytm obj1= new Paytm();
	   Person p= obj1.details();
	   System.out.println(p.getAccNo()); 
	   System.out.println(p.getName());
	   System.out.println(p.getBalance());
	   Scanner sc = new Scanner (System.in);
	   System.out.println("How much amount you want for shopping;");
	   int amount=sc.nextInt();
	   p.setBalance(p.getBalance()-amount);
	   System.out.println("Updated Balance:"+p.getBalance());
	   ;
	}

}
