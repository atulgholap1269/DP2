 package com.baisc;

import java.util.Scanner;

public class GradeCards {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Entre 5 subject marks");
		System.out.println("English:");
		float english = sc.nextFloat();
		System.out.println("Hindi : ");
		float hindi = sc.nextFloat();
		System.out.println("Math: ");
		float math = sc.nextFloat();
		System.out.println("Science : ");
		float science = sc.nextFloat();
     	System.out.println(" SST : ");
		float sst= sc.nextFloat();
		System.out.println(" Marathi : ");
		float marathi= sc.nextFloat();
		
		
		float tmarks= (english+hindi+math+science+sst+marathi);
        float per=(tmarks*100)/650;
        System.out.println("==============================");
        System.out.println("Percentage card of Atul");
        System.out.println("percentage scored : "+per+"%");
        
        if(per>=90)
        {
        	System.out.println("Your Grade is A");
        }
        else if(per>=75 )
        {
        	System.out.println("Your grade is B");
        }
        else if(per>=60)
        {
        	System.out.println("Your grade is c");
        }
        else if(per>=40 )
        {
        	System.out.println("Your Grade is D");
        } 
        else
        {
        	System.out.println("your are fail");
        }
	}

}
