package com.conatinment;

public class Address {
 int serNo, pin;
 String soci, city;
public int getSerNo() {
	return serNo;
}
public void setSerNo(int serNo) {
	this.serNo = serNo;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getSoci() {
	return soci;
}
public void setSoci(String soci) {
	this.soci = soci;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 
  public Address(int serNo, int pin, String soci, String city)
   {
	  System.out.println("inside parameter constructor of Address");
	  this.city=city;
	  this.pin=pin;
	  this.serNo=serNo;
	  this.soci=soci;
   }
  public Address()
  {
	  
  }
  public void showAddressDetails()
  {
	  System.out.println("Address: "+soci+" "+city+" "+serNo+" "+pin);
  }
}
