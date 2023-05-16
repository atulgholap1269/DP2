package com.staticUse;

public class Employee {
	
	int eid;
	String employeeName;
	static String ceo;
	static
	{
		ceo="Pranav sir";
	}
   Employee(int eid, String name)
   {
	   this.eid=eid;
	   employeeName=name;
	   
   }
   static void display()
   {
	   
   }
   static void display1()
   {
	   Employee.display1();
   }
  
   public void show()
   {
	   System.out.print("eid :"+eid);
	   System.out.print("\nEmployee name:"+employeeName);
	   System.out.print("\nCEO:"+ceo);
	   System.out.println();
   }
   public static void main(String[] args) {
	   Employee atul=new Employee(12, "Atul Gholap");
	   Employee navin=new Employee(13, "Navin");
	   atul.show();
	   navin.show();
}

}
