package com.baisc;

import java.util.Scanner;

public class checkFirstCharacterEqualToLastCharacter {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre a word");
		String word= sc.next();
		while(!word.equals("done"))
		{
			
			if(word.charAt(0)==word.charAt(word.length()-1))
			{
				System.out.println("first and last character of word are equal:"+word);
			}
			else
			{
				System.out.println("first and last character of word are not equal");
			}
			System.out.println("Entre a word");
			word= sc.next();
		}
		
		/*do
		{
		if(word.charAt(0) == word.charAt(word.length() - 1))
		{
		System.out.println("First and last character are equals for the word: " + word);
		}
		else
		{
		System.out.println("First and last character are NOT equals for the word: " + word);
		}
		word = sc.next();
		}while(!word.equals("done"));*/
	}
}
