package com.assgnments;

public class Bank {
	public String b_Name;
	private int locker_Id;
	protected float rateOfInterest;
	String branchName;
	public String getb_Name(String b_Name)
	{
		this.b_Name=b_Name;
		return b_Name;
		
	}
	private int getLockerId(int id)
	{
		locker_Id=id;
		return id;
				
	}
	
	  float getRateOfInterest(int rateOfInterest)
	  {
		  this.rateOfInterest=rateOfInterest;
		  return rateOfInterest;
	  }
	  protected String getBranchName(String branchName)
	  {
		  this.branchName=branchName;
		  return branchName;
	  }
	  
	  public static void main(String[] args) {
		Bank obj = new Bank();
		System.out.println(obj.getb_Name("Vapursa"));//public method can call in same class
		System.out.println(obj.getRateOfInterest(10));//default method can call in same class
		System.out.println(obj.getLockerId(123));//private method can call in same class
		System.out.println(obj.getBranchName("Deccan"));// protected method can call in same class
	}
	
}
