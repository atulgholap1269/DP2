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
	public void showVoicePresidentDetails()
	{
		showEmpDetails();
		System.out.println("Additional allowance is :"+getAllowance());
	}
  }
public class PayRollApplication {
public static void main(String[] args) {
	VoicePresident obj = new VoicePresident();
	obj.getEmployeeDetails(12, "Atul", 38000);
	obj.setAllowance(6000);
	obj.showVoicePresidentDetails();
	
	
	
	Manager obj1 = new Manager();
	   // Single Inheritance
    obj1.getEmployeeDetails(12, "Atul", 38000);
    obj1.showEmpDetails();
    obj1.setIncentive(1000.00f);
    obj1.showManagerDetails();
}


}
