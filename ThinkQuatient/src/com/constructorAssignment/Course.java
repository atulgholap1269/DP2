package com.constructorAssignment;

class SubCourse
{
	int subcourseId;
	String subCourseName;
	public SubCourse()
	{
		subcourseId=123;
		subCourseName="production";
	}
}

public class Course {
	int id;
	String name;
	public Course()
	{
		id=11;
		name="mechaniacal";
	}
	public static void main(String[] args) {
		SubCourse obj = new SubCourse();
		System.out.println(obj.subcourseId);
		System.out.println(obj.subCourseName);
		
		Course obj1 = new Course();
		System.out.println(obj1.id);
		System.out.println(obj1.name);
	}
	

}
