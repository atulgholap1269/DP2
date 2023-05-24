package com.baisc;

import java.util.Scanner;

public class GrossSalaryFromBasicSalary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Entre your Basic Salary");
	float basicSalary = sc.nextFloat();
	float grossSalary=0;
	float HRA, DA;
	
	 if(basicSalary>=20000)
	{
		grossSalary=basicSalary+(0.3f*basicSalary)+(0.9f*basicSalary);
	}
	 else if(basicSalary<20000)
	{
		grossSalary=basicSalary+(0.25f*basicSalary)+(0.9f*basicSalary);
	}
    else
	{
		grossSalary=basicSalary+(0.2f*basicSalary)+(0.8f*basicSalary);
	}
	System.out.println("Gross salary is "+grossSalary);
}
}
