package com.assgnments;

import java.util.Scanner;

public class Assign3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter standard of nila");
		int standard=sc.nextInt();
		int square=0;
		int pencil=0;
		if(standard!=0 && standard<=12)
		{
			for(int i=1;i<=standard;i++)
			{
				square=i*i;
				pencil=pencil+square;
			}
			System.out.println("nila gets "+pencil+" pencils");
		}
		else
		{
			System.out.println("Invalid Standard");
		}
	}

}
