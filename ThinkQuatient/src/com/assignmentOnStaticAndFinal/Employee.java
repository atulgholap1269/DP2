package com.assignmentOnStaticAndFinal;

public class Employee {
	int employee_Id;
	String name;
	int salary;
	public Employee(int employee_Id,String name,int salary )
	{
		this.employee_Id=employee_Id;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println(employee_Id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static int totalEmployee()
	{
		int totalEmployee=200;
		return totalEmployee;
	}
	public static void main(String[] args) {
		Employee obj = new Employee(123,"Atul",38000);
		obj.display(); 
		System.out.println(totalEmployee());
		
	}

}
