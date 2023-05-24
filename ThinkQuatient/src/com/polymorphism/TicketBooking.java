package com.polymorphism;

public class TicketBooking {
	public void doOnlinebooking(Bus a)
	{
		a.booking();
	}
	public void doOnlinebooking(Train b)
	{
		b.booking(123);
	}
	public void doOnlinebooking(Aeroplane c)
	{
		c.booking(600.5f);
	}
	
	public static void main(String[] args) {
		TicketBooking obj = new TicketBooking();
		obj.doOnlinebooking(new Bus());
		obj.doOnlinebooking(new Train());
		obj.doOnlinebooking(new Aeroplane());
	}

}
