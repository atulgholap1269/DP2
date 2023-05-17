package com.inherietence;

public class Employee {
  int empId;
  String empName;
  float salary;
  public Employee()
  {
	  System.out.println("default comnstructor of super class");
	  this.empId=123;
	  this.empName="Atul";
	  this.salary=50000;  
  }
  public Employee(int empId,  String empName, float salary)
  {
	  System.out.println("parameterized comnstructor super class");
	  this.empId=empId;
	  this.empName=empName;
	  this.salary=salary; 
  }
  public void getEmployeeDetails(int empId,  String empName, float salary)
  
  {
	  this.empId=empId;
	  this.empName=empName;
	  this.salary=salary;
  }
  public void showEmpDetails()
  {
	  System.out.println("Employee id ="+empId);
	  System.out.println("Employee Name : "+empName);
	  System.out.println("Employee salary : "+ salary);
  }
  public String toString()
  {
	  return "Employee id ="+empId+"Employee Name : "+empName+"Employee salary : "+salary;
  }
}

class Manager extends Employee
{
	float incentive;
	public Manager()
	{
		super(12,"Atul",50000);
		System.out.println("default comnstructor of sub class");
		this.incentive = 10000;
	}
	public Manager(float incentive)
	{
		 System.out.println("parameterized comnstructor of sub class");
		this.incentive = incentive;
	}
	public void setIncentive(float incentive) 
	{
		this.incentive = incentive;
	}

	public float getIncentive() 
	{
		return incentive;
	}
	public void showManagerDetails()
	{
		showEmpDetails();
		System.out.println("Incentive paid in rs : "+getIncentive());
	}

}

class SalesManager extends Manager
{
	float target;
	public void setTarget(float target)
	{
		this.target =target;
	}
	public float getTarget()
	{
		return target;
	}
	public void showSalesManagerDetails()
	{
		showManagerDetails();
		System.out.println("Targer to be achieved: "+getTarget());
		
	}
}
