package com.heirarchical;

public class REClassic350 extends RoyalEnfield {
	 double increasePrice=0.25;
	  public void bulletClassic350()
	  {
		  basePrice=basePrice+(0.25*basePrice);
		  System.out.println("Final Price of RE classic 350 : "+basePrice);
	  }
	  public static void main(String[] args) {
		  REClassic350 obj = new REClassic350();
		  obj.bulletClassic350();
}
}