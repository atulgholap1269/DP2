package com.constructorAssignment;

public class Employee {
  private int emp_Id;
  private String name;
  private int salary;
  
  public void setEmpId(int emp_Id)
  {
	  this.emp_Id=emp_Id;
  }
  public int  getEmpId()
  {
	  return emp_Id;
  }
  public void setName(String name)
  {
	  this.name=name;
  }
  public String getName()
  {
	  return name;
  }
  public void setSalary(int salary)
  {
	  this.salary=salary;
  }
  public int getSalary()
  {
	  return salary;
  }
  public static void main(String[] args) {
	Employee obj= new Employee();
	obj.setEmpId(123);
	obj.setName("Atul Gholap");
	obj.setSalary(38000);
	System.out.println(obj.getEmpId());
	System.out.println(obj.getName());
	System.out.println(obj.getSalary());
}
}
