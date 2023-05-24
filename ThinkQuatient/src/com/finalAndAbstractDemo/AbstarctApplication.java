package com.finalAndAbstractDemo;
abstract class ObjectMovement
{
	int speed;
	static String direction="forward direction";
	abstract public void move(int s);
	public void setSpeed(int sp)
	{
		this.speed=sp;
	}
	public int getSpeed()
	{
		return speed;
	}
}
class Ball extends ObjectMovement
{
	public void move(int se)
	{
		speed=se;
		System.out.println("Now ball is rolling with speed "+speed+" in meter/minute on ground in a "+direction);
	}
	
}
class Truck extends ObjectMovement
{
	public void move(int se)
	{
		speed=se;
		System.out.println("Now Truck is moving with speed "+speed+" in km/hr on ground in a "+direction);
	}
}
public class AbstarctApplication {
	public static void main(String[] args) {
		ObjectMovement e;
		
		e=new Ball();
		e.setSpeed(15);
		System.out.println("Initial speed of ball is "+e.getSpeed()+"meter/minute");
		e.move(10);
		e= new Truck();
		e.setSpeed(100);
		System.out.println("Initial speed of truck is "+e.getSpeed()+"km/hr");
		e.move(60);
	}
	

}
