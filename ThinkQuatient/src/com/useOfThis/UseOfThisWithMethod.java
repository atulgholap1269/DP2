package com.useOfThis;

import java.util.Scanner;

public class UseOfThisWithMethod {
  int amount;
  
  
  public int discount(int discount)
  {
	  return discount;
  }
  public int amountOfBook(int amount)
  {
	  this.amount=amount;
	  int toatalPay=amount-this.discount(50);
	  return toatalPay;
  }
  public void showTotalPay()
  {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter amount of book:");
	  int amount=sc.nextInt();
	  System.out.println("total pay after discount is: "+this.amountOfBook(amount));
  }
  
  public static void main(String[] args) {
	  UseOfThisWithMethod obj= new UseOfThisWithMethod();
	  obj.showTotalPay();
}
}
