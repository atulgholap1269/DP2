package com.patternAss;
//    1
//   10
//  101
// 1010
//10101
public class Assign2 {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		for(int k=1;k<=i;k++)
		{
			if(k%2==0)
			{
				System.out.print("0");
			}
			else
				System.out.print("1");
		}
		
		System.out.println();
	}
}
}
