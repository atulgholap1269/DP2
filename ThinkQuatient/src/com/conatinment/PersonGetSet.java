package com.conatinment;


class Addres
{
	private int pincode;
	private String city;
	public int getPincode()
	{
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
}
public class PersonGetSet {
	private int pid;
	private String name;
	private Addres ad;
	public int getPid()
	{
		return pid;
	}
	public void setPid(int pid)
	{
		this.pid = pid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Addres getAd()
	{
		return ad;
	}
	public void setAd(Addres ad)
	{
		this.ad = ad;
	}
	public static void main(String[] args) {
		PersonGetSet obj = new PersonGetSet();
		obj.setPid(123);
		obj.setName("Atul");
		obj.setAd(new Addres());
		Addres a= obj.getAd();
		a.setCity("Alkuti");
		a.setPincode(414305);
		System.out.println("Person Details: \nName: "+obj.getName()+" Id: "+obj.getPid());
		System.out.println("Address Details: \nCity: "+a.getCity()+" pin: "+a.getPincode());
	}

}
