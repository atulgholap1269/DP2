package com.xobin;

public class Simple {
	
static int a=5;
void incree()
{
	a++;
	
}
void display()
{
	System.out.println("a="+a);
}
 public static void main(String[] args) {
	Simple obj1 = new Simple();
	Simple obj2 =new Simple();
	obj1.incree();
	obj2.incree();
	obj1.display();
	obj2.display();
}
}
