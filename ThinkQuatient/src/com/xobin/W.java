package com.xobin;

public class W {
	static int c;

	public static void main(String[] args) 
	{
		
	
	W w1=c();
	W w2=c(w1);
	W w3=c(w2);
	W w4=c(w3);
	
	}
	private W()
	{
		System.out.println("c = "+c);
	}
	static W c()
	{
		return c++ <=0 ? new W():null;
		
	}
	static W c(W w)
	{
		return c++ <=1 ? new W():null;
		
	}
}
