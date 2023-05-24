package com.assignmentsInheritanceAndPolymorphism;

public class Laptop {
	int noOfUSBPort;
	int processorSpeed;
	public void seNoOfUSBPort(int noOfUSBPort)
	{
		this.noOfUSBPort=noOfUSBPort;
	}
    public void setProcessoeSpeed(int processorSpeed)
    {
    	this.processorSpeed=processorSpeed;
    }
    public int getNoOfUSBPort()
    {
    	return noOfUSBPort;
    }
    public int getProcessoeSpeed()
    {
    	return processorSpeed;
    }
    public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.setProcessoeSpeed(123);
		obj.seNoOfUSBPort(3);
		System.out.println(obj.getNoOfUSBPort());
		System.out.println(obj.getProcessoeSpeed());
	}
}
