package com.assgnments;

public class AccessBook {
public static void main(String[] args) {
	Bank obj =new Bank();
	System.out.println(obj.getb_Name("Vapursa"));//public method can call in other class
	System.out.println(obj.getRateOfInterest(10));//default method can call in other class
	//System.out.println(obj.getLockerId(123));error private method can call in other class
	System.out.println(obj.getBranchName("Deccan"));// protected method can call in other class
}
}
