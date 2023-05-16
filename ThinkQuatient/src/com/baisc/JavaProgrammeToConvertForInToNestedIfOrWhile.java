package com.baisc;

public class JavaProgrammeToConvertForInToNestedIfOrWhile {
	public static void main(String[] args) {
		
		int s=0;
		int t=1;
		int i=0;
		int j=0;
		
       while(i<10)
		{
			s=s+i;
			j=i;
			while(j>0)
			{
				t=t*(j-1);
				j--;
			}
			
			i++;	
		s=s*t;
		System.out.println("T is " + t) ;
		}
       
       System.out.println("S is " + s);
	}

}
