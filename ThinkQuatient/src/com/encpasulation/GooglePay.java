package com.encpasulation;

import java.util.Scanner;

public class GooglePay {
    static  public  void display()
	{
		
	}
	
	public void transferAmount(int amount,Account ac1 )
	{
		System.out.println("Transection is in process...");
		ac1.setBalance(ac1.getBalance()-amount);
		System.out.println("Amount transfered successfully-"
		+"\nUpdate balance of account no "+ac1.getAcno()+" is: "+ac1.getBalance() );			
		}
	
     
   public static void main(String[]s)
     {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter account number");
	   int ano=sc.nextInt();
	   System.out.println("Enter Customer Name");
	   String n= sc.next();
	   System.out.print("Transfered Amount : ");
	   int transAmount=sc.nextInt();
	Account obj=new Account();
	obj.acceptAccountDetails(ano, n ,50000);
	GooglePay gp = new GooglePay();
	gp.transferAmount(transAmount, obj);
    }
}
