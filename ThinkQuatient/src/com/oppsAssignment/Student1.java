package com.oppsAssignment;

import java.util.Scanner;

public class Student1 {
	int math;
	int eng;
	int scie;
	public float percentage(int m, int e, int s1)
	{
		math=m;
		eng=e;
		scie=s1;
		float per=((m+e+s1)*100)/300;
		return per;
	}
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	 int m=sc.nextInt();
    	 int e=sc.nextInt();
    	 int s1=sc.nextInt();
		Student1 s= new Student1();
		float res=s.percentage(m, e, s1);
		if(res>=60)
		{
			System.out.println("first class");
		}
		else if(res>=40)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
