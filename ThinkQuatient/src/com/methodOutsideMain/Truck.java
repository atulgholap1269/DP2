package com.methodOutsideMain;
import com.overloading.Car;
public class Truck extends Car {
  public static void main(String[] args) {
	Truck t = new Truck();
	System.out.println(t.wheel);
}
}
