package com.baisc;

public class EvenOddWithinRange {
public static void main(String[] args) {
	
	for(int i=1;i<=50;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("negative number: "+(i*i) );
		}
	}
}
}
