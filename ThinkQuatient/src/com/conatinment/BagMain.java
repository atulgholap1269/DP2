package com.conatinment;

public class BagMain {
	public static void main(String[] args) {
	
	BagGetterSetter obj= new BagGetterSetter();
	obj.setBrandName("American Torister");
	obj.setBagPrice(650);
	obj.setP(new Pen1());
	Pen1 pe=obj.getP();
	pe.setName("ink pen");
	pe.setColoure("cloure");
	pe.setPenPrice(10);
	pe.setB(new Nib1());
	Nib1 n=pe.getB();
	n.setMaterial("plastic");
	n.setNibPrice(3);
	
	System.out.println("Bag Details : Brand name: "+ obj.getBrandName()+" price : "+obj.getBagPrice());
	System.out.println("Pen Deatils: name: "+pe.getName()+" coloure : "+pe.getColoure()+" price : "+pe.getPenPrice());
	System.out.println("Nib Details: material: "+n.getMaterial()+" price : "+n.getNibPrice());
	}
}
