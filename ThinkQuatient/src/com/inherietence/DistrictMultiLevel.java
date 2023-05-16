package com.inherietence;
class Village
{
	int population=7000;
	public void villageInfo()
	{
		System.out.println("Village contain "+population+" people");
	}
}
class Taluka extends Village
{
	 
	public void talukaInfo()
	{
		population =150000;
		System.out.println("Taluka contain "+population+" peaople");
	}
}
public class DistrictMultiLevel extends Taluka {
     public void districInfo()
     {
    	 population =15000000; 
    	 System.out.println("District contain "+population+" people");
     }
     public static void main(String[] args) {
    	 DistrictMultiLevel obj = new DistrictMultiLevel();
    	 obj.villageInfo();
    	 obj.talukaInfo();
    	 obj.districInfo();
	}
}
