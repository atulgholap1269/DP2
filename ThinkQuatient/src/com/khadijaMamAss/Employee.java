package com.khadijaMamAss;

public class Employee {
   int employee_Id;
   String name;
   int salary;
   Employee( int employee_Id,String name, int salary )
   {
	  this.employee_Id =employee_Id;
	  this.name=name;
	  this.salary=salary;
   }
   public static int totalEmp(int employeeNo)
   {
	   return employeeNo;
   }
   public void display()
   {
	   System.out.println("Employee id:"+employee_Id);
	   System.out.println("Employee name:"+name);
	   System.out.println("Employee salary:"+salary);
	   System.out.println("Toatl number ofEmployee: "+Employee.totalEmp(10));
   }
   
   public static void main(String[] args) {
	   Employee obj1 = new Employee(121, "Atul Gholap", 40000);
	   obj1.display();
	   Employee obj2 = new Employee(122, "Atul Gholap", 45000);
	   obj2.display();
	   Employee obj3 = new Employee(123, "Atul Gholap", 46000);
	   obj3.display();
	   Employee obj4 = new Employee(124, "Atul Gholap", 47000);
	   obj4.display();
	   Employee obj5 = new Employee(125, "Atul Gholap", 48000);
	   obj5.display();
	   
	   
}
}
