package com.baisc;

public class Car {
	int modelNo;
	String carName;
	int carPrize;
	String carColoure;
	public static void main(String[] args) {
		Car suzuki=new Car();
		suzuki.modelNo=800;
		suzuki.carName="maruti";
		suzuki.carPrize=450000;
		suzuki.carColoure="White";
		System.out.println("Maruti Suzuki car properties :");
		System.out.println("model no:"+suzuki.modelNo+" carName: "+suzuki.carName+" carPrize:"+suzuki.carPrize+" carColoure:"+suzuki.carColoure);
		
		System.out.println();
		
		Car tata =new Car();
		tata.modelNo=2017;
		tata.carName="Nexon";
		tata.carPrize=1080000;
		tata.carColoure="Black";
		System.out.println("Tata Nexon car properties :");
		System.out.println("model no:"+tata.modelNo+" carName: "+tata.carName+" carPrize:"+tata.carPrize+" carColoure:"+tata.carColoure);
		
		System.out.println();
		
		Car toyota =new Car();
		toyota.modelNo=2023;
		toyota.carName="Fortuner";
		toyota.carPrize=3206000;
		toyota.carColoure="white";
		System.out.println("Toyota car properties :");
		System.out.println("model no:"+toyota.modelNo+" carName: "+toyota.carName+" carPrize:"+toyota.carPrize+" carColoure:"+toyota.carColoure);
	}

}
