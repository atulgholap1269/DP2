package com.heirarchical;

public class REBullet350 extends RoyalEnfield {
  double increasePrice=0.15;
  public void bullet350()
  {
	  basePrice=basePrice+(0.15*basePrice);
	  System.out.println("Final Price of RE 350 : "+basePrice);
  }
  public static void main(String[] args) {
	  REBullet350 obj = new REBullet350();
	  obj.bullet350();
}
  
}
