package com.writeenAssignment;



class Overload
{
	static int x=2;
	int y;
	void add(int a)
	{
  		x=a+1;
	}
	void add(int a, int b)
	{
		add(a);
		x+=a+2;
	}
}
public class OverLoad_Methods {
	public static void main(String[] args) {
		Overload obj = new Overload();
		int a=0;
		obj.add(6,7);
		System.out.println(obj.x);
	}

}
