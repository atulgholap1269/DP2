package com.khadijaMamAss;

public class EmployeeBean {
	   private int employee_Id;
	   private String name;
	   private int salary;  
	   public void setEmployeeId(int employeeId)
	   {
		   this.employee_Id= employeeId;
	   }
	   public void setName(String name)
	   {
		   this.name= name;
	   }
	   public void setSalary(int salary)
	   {
		   this.salary= salary;
	   }
	   public int getEmployee()
	   {
		   return employee_Id;
	   }
	   public String getName()
	   {
		   return name;
	   }
	   public int getSalary()
	   {
		   return salary ;
	   }

}
