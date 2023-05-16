package com.accessModifireDemo;
import com.assgnments.*;
public class BankSubClass extends Bank {
	public static void main(String[] args) {
		BankSubClass obj = new BankSubClass();
		System.out.println(obj.getb_Name("Vapursa"));//public method can call in other package
		//System.out.println(obj.getRateOfInterest(10)); error//default method can not  call in other package
		//System.out.println(obj.getLockerId(123));  error//private method can not  call in other package
		System.out.println(obj.getBranchName("Deccan"));// protected method can call in other package with the help of inheritance
	}

}
