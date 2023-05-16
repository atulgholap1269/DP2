package com.oppsAssignment;

public class Account {
	int acc_No;
	String name;
	float amount;
	
     public void insetData(int acc_No,String name,float amount)
     {
    	 this.acc_No=acc_No;
    	 this.name=name;
    	 this.amount=amount;
     }
     public void displayAccountInfo()
     {
    	 System.out.println("Account holder name:"+name);
    	 System.out.println("Account No.:"+acc_No);
    	 System.out.println("Balance:"+amount);
    	  
     }
     public float deposit(float depoAmount)
     {
    	amount=amount+depoAmount;
    	System.out.print("Updated Balance:");
    	return amount;
     }
     public float withhrow(float withrowAmount)
     {
    	 amount =amount-withrowAmount;
    	 System.out.print("Updated Balance:");
    	 return amount;
     }
     public void checkBalance()
     {
    	 System.out.println("Balance:"+amount);
     }
     public static void main(String[] args) {
    	 
    	 Account obj=new Account();
    	 obj.insetData(123, "Atul Gholap",54000);
    	 obj.displayAccountInfo();
    	 System.out.println( obj.deposit(500));
    	 System.out.println(obj.withhrow(200));
    	
    	  obj.checkBalance();
	}

}
