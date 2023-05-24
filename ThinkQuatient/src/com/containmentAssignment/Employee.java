package com.containmentAssignment;
class MyDate
{
	int day;
	String month;
	int year;
//	MyDate(int day,String month,int year )
//	{
//		this.day=day;
//		this.month=month;
//		this.year=year;
//	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
class Dept
{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
//	Dept(int id, String name)
//	{
//		this.id=id;
//	    this.name=name;
//	}
	public String toString()
	{
		return id+" "+name;
	}
}
public class Employee {
    int id;
    String name;
    int salary;
    String dept;
    Dept d;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public MyDate getM() {
		return m;
	}
	public void setM(MyDate m) {
		this.m = m;
	}
	MyDate m;
//    Employee(int id, String name,int salary,  String dept,  Dept d,MyDate m)
//    {
//    	this.id=id;
//    	this.name=name;
//    	this.salary=salary;
//    	this.dept=dept;
//    	this.d=d;
//    	this.m=m;
//    }
    public String toString()
    {
    	return id+" "+name+" "+salary+" "+dept+" "+d+" "+m;
    }
    public static void main(String[] args) {
//    	Employee obj = new Employee(12, "Atul",38000, "technical",new Dept(1, "tech"), new MyDate(24, "May",2023));
//        System.out.println(obj);
    	Employee obj = new Employee();
        obj.setId(12);
        obj.setName("Atul");
        obj.setSalary(38000);
        obj.setM(new MyDate());
        MyDate obj1= obj.getM();
        obj1.setDay(24);
        obj1.setMonth("may");
        obj1.setYear(2023);
        obj.setD(new Dept());
        Dept d= obj.getD();
        d.setId(11);
        d.setName("Mechanical");
        System.out.println("employee details "+obj.getId()+" "+obj.getName()+obj.getSalary());
        System.out.println("Department details: "+d.getId()+" "+d.getName());
        System.out.println("Date: "+obj1.getDay()+" "+obj1.getMonth()+" "+obj1.getYear());
        
        
    	
	}
}
