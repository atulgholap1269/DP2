package com.conatinment;

public class ShipMentMain {
public static void main(String[] args) {
	//using setter getter
//	Shipment obj = new Shipment();
//	obj.setShipmentId(123);
//	obj.setM(new MyDate());
//	MyDate d=obj.getM();
//	d.setDd(15);
//	d.setMm(05);
//	d.setYy(2023);
//	obj.setO(new Order());
//	Order or=obj.getO();
//	or.setCustId(123);
//	or.setOrderId(11);
	
	//using constructor
	Shipment obj = new Shipment(123, new Order(11, 33), new MyDate(15, 05,2023));
	System.out.println(obj);
//	System.out.println("Shipment details:");
//	System.out.println("Shipment id: "+obj.getShipmentId());
//	System.out.println();
//	System.out.println("Order details:");
//	System.out.println("cust id:"+or.getCustId()+"order id:"+or.getOrderId());
//	System.out.println();
//	System.out.println("Order date details: ");
//	System.out.println(d.getDd()+":"+d.getMm()+":"+d.getYy());
//	
}


}
