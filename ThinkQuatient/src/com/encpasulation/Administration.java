package com.encpasulation;

import java.util.Scanner;

public class Administration {
	
	public void checkUseraname(String userName,Authentication at )
	{
		if(userName==at.getUserName())
		{
			System.out.println("Valid username");
		}
		else
		{
			System.out.println(" Invalid username");
		}
	}
	public void checkPassword(String password,Authentication at )
	{
		if(password==at.getPassword())
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println(" Invalid password");
		}
	}
	
	public static void main(String[] s) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter username:");
		String user=sc.next();
		System.out.print("Enter password:");
		String pass=sc.next();*/
		
		Administration admini=new Administration();
		Authentication obj= new Authentication();
		obj.acceptAccountCredentials("atulgholap1269@gmail.com", "Atul@1995");
		admini.checkPassword("Atul@1995", obj);
		admini.checkUseraname("atulgholap1269@gmail.com", obj);
				
	}

}
