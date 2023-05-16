package com.oppsAssignment;

public class Student2 {
	float math;
	float english;
	float marathi;
	String studentName="Atul Gholap";
	public void listSubMarks(int math,int english,int marathi)
	{
		this.math=math;
		this.english=english;
		this.marathi=marathi;
	}
	public void displayStudentData()
	{
		System.out.println("Name of student:"+studentName);
		System.out.println("Marks Obtained");
		System.out.println("Math:"+math);
		System.out.println("English:"+english);
		System.out.println ("Marathi:"+marathi);
	}
	public float percentage()
	{
		System.out.print("Percentage of student:");
		float percent=((math+english+marathi)/300)*100;
		return percent;
		
	}
	public static void main(String[] args) {
		Student2 obj = new Student2();
		obj.listSubMarks(80,85,87);
		obj.displayStudentData();
		 System.out.println(obj.percentage());
		
	}
			
	

}
