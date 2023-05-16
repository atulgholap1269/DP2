package com.conatinment;

import java.util.Scanner;

public class ContonmaintExample {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Address of Employee:");
	System.out.println("Enter servay number:");
	int ser=sc.nextInt();
	System.out.println("Enter pin code:");
	int pi=sc.nextInt();
	System.out.println("Enter Society Name:");
	String soc=sc.next();
	System.out.println("Enter City Name:");
	String cit = sc.next();
	
	System.out.println("Enter Employee Details:");
	System.out.println("Enter Employee ID:");
	int empid=sc.nextInt();
	System.out.println("Enter Employee Name:");
	String empName=sc.next();
	System.out.println("Enter salary: ");
	float salary=sc.nextFloat();
	
	
			
	EmployeeAd obj1=new EmployeeAd(empid, empName, salary);
	Address obj2 = new Address(ser, pi, soc, cit);
	obj1.showempRecord();
	obj1.setAddress(obj2);//containment achieve using setter method of Employee
	
}
}
