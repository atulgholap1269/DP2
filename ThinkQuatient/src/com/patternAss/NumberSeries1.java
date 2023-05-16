package com.patternAss;

import java.util.Scanner;

public class NumberSeries1 {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter no of term");
	   int term= sc.nextInt();
	  
	   int nextTerm;
	  for(int i=1;i<=term;i++)
	  {
		  nextTerm=(i*i)-1;
		System.out.print(nextTerm+",");
	  }
}
}
