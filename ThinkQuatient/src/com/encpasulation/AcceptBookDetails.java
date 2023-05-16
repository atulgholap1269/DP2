package com.encpasulation;

import java.util.Scanner;

public class AcceptBookDetails {
	public static void main(String[] args) {
		Book obj= new Book();
		System.out.print("Book Id:");
		obj.setBookId(123);
		System.out.println("Book Name:");
		obj.setBookName("Vapursa");
		obj.setPrice(500);
		System.out.println(obj.getBookId());
		//System.out.println(obj.getBookName());
		System.out.println(obj.getPrice());
		Scanner sc = new Scanner(System.in);
		System.out.println("What your book Name:");
		String bookName=sc.next();
		
		if(bookName.equals(obj.getBookName()))
		{
			System.out.println("Congratulation! You will get additional disscount:5%\nYou have to pay:"+(obj.getPrice()-(0.05*obj.getPrice())));
		}
		else
		{
			System.out.println("Sorry! You will not get any discount\nYou have to pay:"+obj.getPrice());
		}
		
	}

}
