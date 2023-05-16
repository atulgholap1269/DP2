package com.oppsAssignment;

public class Box {
int length;
int width;
int height;
long valume;
int lengthR;
int widthR;
public long valumeOfBox(int l, int w, int h)
{
	length=l;
	width=w;
	height=h;
	valume=l*w*h;
	return valume;
}
public long areaOfRec(int l, int w)
{
	lengthR=l;
	widthR=w;
	long area=l*w;
	return area;
}
public static void main(String[] args) {
	Box b= new Box();
	long res = b.valumeOfBox(10, 10, 10);
	System.out.println(res);
	System.out.println(b.areaOfRec(20,20) );
}
}

