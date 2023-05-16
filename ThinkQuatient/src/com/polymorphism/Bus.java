package com.polymorphism;

public class Bus
{
	
	public void booking()
	{
		System.out.println("Book the bus");
	}

}

   class Train
{
	   public void booking(int amount)
		{
			System.out.println("Book the train amount: "+amount);
		}
}
   class Aeroplane
   {
	   public void booking(float amount)
	   {
		   System.out.println("Book the aeroplane: "+amount);
	   }
   }
