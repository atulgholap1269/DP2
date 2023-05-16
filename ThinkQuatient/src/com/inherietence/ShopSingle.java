package com.inherietence;
class Mall
{
	public void mallInfo()
	{
		System.out.println("Season mall in Pune");
	}
}
public class ShopSingle extends Mall {
	public void shopInfo()
	{
		System.out.println("Mall conatin Deacathlon shop");
	}
	public static void main(String[] args) {
		ShopSingle obj = new ShopSingle();
		obj.shopInfo();
		obj.mallInfo();
		
	}


}
