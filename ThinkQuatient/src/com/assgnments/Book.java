package com.assgnments;

import java.util.Scanner;

public class Book {
   int id;
   String bookName;
   int price;
   String authorName;
   Book (int id, String bookName, int price, String authorName )
   {
	  this.id=id;
	  this.bookName=bookName;
	  this.price=price;
	  this.authorName=authorName;
   }
   void showBook()
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Author name:");
	   String a_Name=sc.nextLine();
	   if(a_Name.equals(authorName))
	   {
		   System.out.println("You are eligible for 50% discount...");
		   System.out.println("You have to pay:"+(price-50));
	   }
	   else
	   {
		   System.out.println("You are not eligible for 50% discount..."); 
		   System.out.println("You have to pay:"+price);
	   }
   }
   public static void main(String[] args) {
	Book obj=new Book(123,"Vapursa",500,"Vapu" );
	obj.showBook();
	//Book obj1=new Book();
}
}
