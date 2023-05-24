package com.writeenAssignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int sum=0;
		//int i=3;
		while(sum<=10000)
		{
			
			sum=a+b;
			a=b;
			b=sum;
			if(sum%5!=0)
			{
				System.out.println(sum+",");
			}
			
		}
		
	}

}
