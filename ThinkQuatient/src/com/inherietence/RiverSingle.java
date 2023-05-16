package com.inherietence;
class Sea
{
	public void seaInfo()
	{
		System.out.println("Sea contain solty water");
	}
}
public class RiverSingle extends Sea{
	public void riverInfo()
	{
		System.out.println("River contain sweet water");
	}
	public static void main(String[] args) {
		RiverSingle obj = new RiverSingle();
		obj.riverInfo();
		obj.seaInfo();
	}

}
