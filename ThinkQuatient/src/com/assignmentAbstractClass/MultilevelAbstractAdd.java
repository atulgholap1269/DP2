package com.assignmentAbstractClass;
abstract class FistNum
{
	int x;
//    FistNum(int x)
//	{
//		this.x=x;
//	}
	 abstract void sum();
}
abstract class SecondNum extends FistNum
{
	int y;
//	SecondNum(int y)
//	{
//		super(10);
//		this.y=y;
//	}
	public abstract void display();
}
public class MultilevelAbstractAdd extends SecondNum {
	int sum=0;
//	MultilevelAbstractAdd()
//	{
//		super(20);
//	}
     void sum()
    {
    	sum =x+y;
    }
    public void display()
    {
    	System.out.println(sum);
    }
  public static void main(String[] args) {
	MultilevelAbstractAdd obj = new MultilevelAbstractAdd();
	obj.x=20;
	obj.y=10;
	obj.sum();
	obj.display();
	 
	}

}
