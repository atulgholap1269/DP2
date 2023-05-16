package com.overloading;

public class MethodOverLLoadingToAreas {
	
    public void area(int radius)
    {
    	System.out.println("Area of circle:"+(3.14*radius*radius));
    }
    public void area(int length, int height)
    {
    	System.out.println("Area of Rectangle:"+(length*height));
    }
    public void area(float side, float side1)
    {
    	System.out.println("Area of side:"+(side*side1));
    }
    public static void main(String[] args) {
    	MethodOverLLoadingToAreas obj= new MethodOverLLoadingToAreas();
    			obj.area(5);
    			obj.area(5, 5);
    			obj.area(10, 10);
    	
	}
}
