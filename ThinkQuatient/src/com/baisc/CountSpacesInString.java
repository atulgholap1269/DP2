package com.baisc;

import java.util.Scanner;

public class CountSpacesInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Any String");
		String str=sc.nextLine();
		
		int count=0;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
			
		}
		System.out.println("count of whitespace is "+count);
//	    for(char ch:str.toCharArray())
//	    {
//	    	if(Character.isWhitespace(ch))
//	    	{
//	    		count++;
//	    	}
//	    }
//	    System.out.println("count of whitespace is "+count);
	}

}
