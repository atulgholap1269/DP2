package com.constructorAssignment;

public class Academy {
 private int noOfStudent;
 private String academyName;
 private String studentName;
 private int studentRollNo;
public int getNoOfStudent() 
{
	return noOfStudent;
}
public void setNoOfStudent(int noOfStudent) 
{
	this.noOfStudent = noOfStudent;
}
public String getAcademyName()
{
	return academyName;
}
public void setAcademyName(String academyName) 
{
	this.academyName = academyName;
}
public String getStudentName()
{
	return studentName;
}
public void setStudentName(String studentName) 
{
	this.studentName = studentName;
}
public int getStudentRollNo() 
{
	return studentRollNo;
}
public void setStudentRollNo(int studentRollNo) 
{
	this.studentRollNo = studentRollNo;
}
public static void main(String[] args) {
	Academy obj = new Academy();
	obj.setAcademyName("Royal");
	obj.setNoOfStudent(200);
	obj.setStudentName("Atul Gholap");
	obj.setStudentRollNo(127);
	System.out.println(obj.getAcademyName());
	System.out.println(obj.noOfStudent);
	System.out.println(obj.getStudentName());
	System.out.println(obj.getStudentRollNo());
}
}
