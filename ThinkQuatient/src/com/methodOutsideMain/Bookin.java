package com.methodOutsideMain;

import java.util.Scanner;

public  class Bookin {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter movie name");
		String name=sc.next();
		System.out.println("enter coupan");
		int coupan=sc.nextInt();
		Movie obj = new Movie(123,name,200,coupan);
	    obj.showDetails();
	    int price1=obj.getPrice();
	    
	    if(coupan==100)
	    {
	    	System.out.println("discount:"+50);
	    	System.out.println("total price:"+(price1-50));
	    }
	    else if(coupan==50)
	    {
	    	System.out.println("discount:"+25);
	    	System.out.println("total price:"+(price1-25));
	    }
	    else
	    {
	    	System.out.println("no discount");
	    	System.out.println("total price:"+price1);
	    }
	System.out.println("Enjoy the movie....");
	
	}
}
