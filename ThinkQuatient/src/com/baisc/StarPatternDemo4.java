package com.baisc;

public class StarPatternDemo4
{
	//1234
	// 123
	//  12
	//   1
	public static void main(String[] args)
	{
		for(int i =5 ;i>=1;i--)
			
		{
			for(int k=i;k<=5;k++)
			{
				System.out.print(" ");
			}
			for(int j=1 ;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
//		int l;
//		for(int i =1 ;i<=4;i++)
//			
//		{
//			l=1;
//			for(int k=2;k<=i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i ;j<=4;j++)
//			{
//				System.out.print(l);
//				l++;
//			}
//			System.out.println();
//		}
	}

}
