package com.finalAndAbstractDemo;
   abstract class Card
   {
	   int price =600;
	   static String name;
	   final String size ="4*4";//we can declare all types variable in Abstract class
	  abstract void makeCard();
	 // public static void check(); Static method always required  body.
	 // public static abstract void checkCard(); we can not static abstract method
	  
	  public void checkPrice()// abstract class also contain complete method
	  {
		  System.out.println("price per card ="+250);
	  }
	  Card(int x)//if we declare constructor in abstract class then we have call it inside sub class constructor
	  {
		  System.out.println("Cards...."+x);
	  }
   }
   class BirthdayCard extends Card
   {
	   BirthdayCard()
	   {
		   super(200);
	   }
	   @Override
	   void makeCard()
	   {
		   System.out.println("Hi this is birthday invitation");
	   }
	  public static void checkCard()
	  {
		  
	  }
	  
	   
   }
public class AbstractDemo {
  public static void main(String[] args) {
	 // Card cr = new Card(); we can not create the object of abstract class
	Card c = new BirthdayCard();
	c.makeCard();
	c.checkPrice();
}
}
