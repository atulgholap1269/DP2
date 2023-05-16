package com.oops;

public class Shopping {
	int cust_Id;
	String product_Name;
	int product_Prize;
	int qauntity;
	
	public void shoppingDetails(int id, String name, int prize, int qty)
	{
		cust_Id=id;
		product_Name=name;
		product_Prize=prize;
		qauntity=qty;
	}
	
	public int bill()
	{
		int bill=qauntity*product_Prize;
		return bill;
	}
	public void display( )
	{
		System.out.println("id:"+cust_Id+" name:"+product_Name+" prize:"+product_Prize+" qty: "+qauntity);
	}
	public static void main(String[] args)
	{
		Shopping show= new Shopping();
		show.shoppingDetails(1,"mobile",10000,1);
		
		if(show.qauntity>0)
		{
			show.display();
			System.out.println("Bill: "+show.bill());
			
	  	}
		else
		{
			System.out.println("qty less than 0");
		}
	}
	

}
