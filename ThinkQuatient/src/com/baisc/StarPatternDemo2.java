package com.baisc;

public class StarPatternDemo2 {
	public static void main(String[] args) {
		//    *
		//   * *
		//  * * *
		// * * * *
		
		/*for(char i='A';i<='D';i++)
		{
			
			for(char k='D';k>=i;k--)
			{
				System.out.print("*");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+"&");
			}
			System.out.println();
		}*/
		for(int i=1;i<=4;i++)
	     {
		
		   for(int k=4;k>=i;k--)
		   {
			System.out.print(" ");
		   }
		    for(int j=1;j<=i;j++)
		    {
			System.out.print(i+" " );
		    }
		System.out.println();
	}
		
		//* * * * *
		// * * * *
		//  * * *
		//   * *
		//    *
		
	/*for(int i=1;i<=5;i++)
	{
		for(int k=2;k<=i;k++)
		{
			System.out.print(" ");
		}
		for(int j=5;j>=i;j--)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}*/
	}
}
