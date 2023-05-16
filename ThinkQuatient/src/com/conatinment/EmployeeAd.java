package com.conatinment;

public class EmployeeAd {
  int empid;
  String empName;
  float salary;
  Address ad;
  public EmployeeAd() {}
  public EmployeeAd(int empid, String empName,float salary )
  {
	  System.out.println("Inside para constructor of employee");
	  this.empid=empid;
	  this.empName=empName;
	  this.salary=salary;
  }
  
  public void showempRecord()
  {
	  System.out.println("Employee Name: "+empName);
	  System.out.println("Employee Id: "+empid);
	  System.out.println("Salary: "+salary);
  }
  public void setAddress(Address ad)
  {
	this.ad=ad;  
	ad.showAddressDetails();
  }
  
  
}
