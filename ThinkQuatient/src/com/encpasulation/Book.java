package com.encpasulation;

public class Book {
	private int bookId;
	private String bookName;
	private int price;
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public int getBookId()
	{
		return bookId;
	}
	public String getBookName()
	{
		return bookName;
	}
	public int getPrice()
	{
		return price;
	}

}
