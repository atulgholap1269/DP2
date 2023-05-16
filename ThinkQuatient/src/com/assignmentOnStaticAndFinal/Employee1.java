package com.assignmentOnStaticAndFinal;

import java.util.Random;

public class Employee1 {
	int randomId=1;
	public int displayRandomId()
	{
    Random rand = new Random();
    for(int i=0;i<=100;i++)
     {    	       
    	randomId=rand.nextInt();
    	
     }
    return randomId;
	}
	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		System.out.println(obj.displayRandomId());
	}
}
