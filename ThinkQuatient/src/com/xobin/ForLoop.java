package com.xobin;

public class ForLoop {
	public static void main(String[] args) {
		outer:
			for(int i=1;i<=4;i++)
			{
				inner:
					for( int j=1; j<=4;j++)
					{
						if(j==1)
						{
							//break inner;
							//System.out.println("A");
						}
						
					}
				System.out.println("A");
			}
	}

}
