 package com.oops;

public class Student {
   int std_Id;
   String std_Name;
   int math;
   int english;
   int science;
   float per;
    public void studentDetails(int id,String name)
    {
    	std_Id=id;
    	std_Name="Atul";
    }
    public void perForThreeSub(int mathM,int engkishM, int scienceM )
    {
    	math=mathM;
    	english=engkishM;
    	science=scienceM;
    	per=((math+science+english)*100)/300;
    	
    }
    public void display()
    {
    	System.out.println("id:"+std_Id +" name:"+std_Name);
    	System.out.println("percentage is:"+per);
    }
    
    public static void main(String[] args) {
		Student show= new Student();
		show.studentDetails(786, "Atul");
		show.perForThreeSub(85,65,88);
		show.display();
	}
}

