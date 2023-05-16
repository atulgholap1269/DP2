package com.conatinment;
 class Order
 {
	private int orderId;
	private int custId;
	//using setter getter methdo
//	public int getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(int orderId) {
//		this.orderId = orderId;
//	}
//	public int getCustId() {
//		return custId;
//	}
//	public void setCustId(int custId) {
//		this.custId = custId;
//	}
	//using constructor
	public Order(int orderId, int custId)
	{
		this.custId=custId;
		this.orderId=orderId;
	}
	public String toString()
	{
		return custId+" "+orderId;
	}
	
	
 }
 class MyDate
 {
	 private int mm;
	 private int dd;
	 private int yy;
	 //using getter setter
//	 public int getMm() {
//		return mm;
//	}
//	public void setMm(int mm) {
//		this.mm = mm;
//	}
//	public int getDd() {
//		return dd;
//	}
//	public void setDd(int dd) {
//		this.dd = dd;
//	}
//	public int getYy() {
//		return yy;
//	}
//	public void setYy(int yy) {
//		this.yy = yy;
//	}
	public MyDate(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString()
	{
		return dd+":"+mm+":"+yy;
	}
 }
 
public class Shipment {
private int shipmentId;
private Order o;
private MyDate m;
//using setter getter
//public int getShipmentId() {
//	return shipmentId;
//}
//public void setShipmentId(int shipmentId) {
//	this.shipmentId = shipmentId;
//}

//public Order getO() {
//	return o;
//}
//public void setO(Order o) {
//	this.o = o;
//}
//public MyDate getM() {
//	return m;
//}
//public void setM(MyDate m) {
//	this.m = m;
//}
public Shipment(int shipmentId,Order o,MyDate m )
{
	this.shipmentId=shipmentId;
	this.m=m;
	this.o=o;
}
public String toString()
{
	return shipmentId+" Order details: "+o+"Date "+m;
}
}
