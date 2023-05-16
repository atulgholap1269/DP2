package com.baisc;

public class StarPattern7 {
	public static void main(String[] args) {
		int x=1;int j ;
		for(int i=1;i<=3;i++)
		{
			for( j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}

            for (j = i; j >= 1; j--) 
            {
				
				if(x==1)
				{
				System.out.print(" ");
				}else
				{
				System.out.print(j);
				}
				x++;
			}
			
			System.out.println();
		}
	}

}
