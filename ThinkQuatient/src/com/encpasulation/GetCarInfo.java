package com.encpasulation;

import java.util.Scanner;

public class GetCarInfo {
	public void validateCar(int speed, Car obj1)
	{
		if(speed>obj1.getSpeedLimit())
		{
			System.out.println("Car speed is greater than limit");
			System.out.println("Car Model number:"+obj1.getModelNo());
			System.out.println("Car Name:"+obj1.getCarName());
			System.out.println("speed limit:"+obj1.getSpeedLimit());
		}
		else
		{
			System.out.println("Car speed is in limit\nPlease let him go!");
		}
	}
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Car Model number");
		   int model_No=sc.nextInt();
		   System.out.println("Enter Car Name");
		   String car_Name= sc.next();
		   System.out.print("Enter speed limit ");
		   int speed_Limit=sc.nextInt();
		   System.out.println("Enter car current speed");
		   int speed=sc.nextInt();
		   Car obj= new Car();
		   obj.acceptCarDetails(model_No, car_Name, speed_Limit);
		   GetCarInfo gc= new GetCarInfo();
		  
		   gc.validateCar(speed, obj);
		
	}

}
