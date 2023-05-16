package com.baisc;

import java.util.Scanner;

public class ElctricityBillFromUnit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre your consumption Unit");
		float unitcosume = sc.nextFloat();
		float unitCharge=0;
		float totalBill=0;
		
		
		
		
		 
	     if(unitcosume<=50)
		{
	    	unitCharge=0.5f*unitcosume;
			 totalBill=unitCharge+0.2f*unitCharge;
		}
	     else if(unitcosume>50 &&unitcosume<=150)
			{
			 unitCharge=0.75f*unitcosume;
			 totalBill=unitCharge+0.2f*unitCharge;
			}
	     else if(unitcosume>150 &&unitcosume<=250)
			{
				 unitCharge=1.2f*unitcosume;
				 totalBill=unitCharge+0.2f*unitCharge;
			}
	     else
			{
				 unitCharge=1.5f*unitcosume;
				 totalBill=unitCharge+0.2f*unitCharge;
			}
		System.out.println("total Bill is :"+totalBill);
	}
}
