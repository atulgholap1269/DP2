package com.encpasulation;


public class Car {
	private int model_No;
	private String car_Name;
	private int speed_Limit;
	
	public void setModelNo(int model_No)
	{
		this.model_No=model_No;
		
	}
	public void setCarName(String car_Name)
	{
		this.car_Name=car_Name;
		
	}
	public void setSpeedLimir(int speed_limit)
	{
		this.speed_Limit=speed_limit;
		
	}
	
	public int getModelNo()
	{
		return model_No;
	}
	public String getCarName()
	{
		return car_Name;
	}
	public int getSpeedLimit()
	{
		return speed_Limit;
	}
	public void acceptCarDetails(int model_No, String car_Name,int speed_limit )
	{
		this.model_No=model_No;
		this.car_Name=car_Name;
		this.speed_Limit=speed_limit;
	}
	

}
