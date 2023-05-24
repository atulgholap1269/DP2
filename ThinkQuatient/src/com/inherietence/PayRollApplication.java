package com.inherietence;
class VoicePresident extends Employee
  {
	float allowance;

	public float getAllowance() {
		return allowance;
	}
   
	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	public float calculateSalary()
	{
		salary=salary +getAllowance();
		return salary;
	}
	public void showVoicePresidentDetails()
	{
		showEmpDetails();
		System.out.println("Additional allowance is :"+getAllowance());
	}
  }
public class PayRollApplication {
public static void main(String[] args) {
	Employee e;
	VoicePresident obj = new VoicePresident();
	obj.getEmployeeDetails(12, "Atul", 38000);
	obj.setAllowance(16000);
	obj.showVoicePresidentDetails();
    e=obj;
    System.out.println("Voice president Total salary : "+e.calculateSalary());
	System.out.println("=====================================");
	
	Manager obj1 = new Manager();
	   // Single Inheritance
    obj1.getEmployeeDetails(12, "Atul", 38000);
    obj1.setIncentive(10000.00f);
    obj1.showManagerDetails();
    e=obj1;
    System.out.println("Manager total Salary is: "+obj1.calculateSalary());
    
    
}


}
