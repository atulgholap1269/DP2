package com.conatinment;
class Engine
{
	// using constructor
//	String eng_Type;
//	String cleanUpdate;
//	public Engine(String eng_Type,String cleanUpdate )
//	{
//		this.eng_Type=eng_Type;
//		this.cleanUpdate=cleanUpdate;
//	}
//	public String toString()
//	{
//		return "Engine Type: "+eng_Type+" clean update: "+cleanUpdate;
//	}
	
	// using getter and setter
	private String eng_Type;
	private String cleanUpdate;
	public String getEng_Type() 
	{
		return eng_Type;
	}
	public void setEng_Type(String eng_Type)
	{
		this.eng_Type = eng_Type;
	}
	public String getCleanUpdate() 
	{
		return cleanUpdate;
	}
	public void setCleanUpdate(String cleanUpdate) 
	{
		this.cleanUpdate = cleanUpdate;
	}
}
class Gear
{
//	
//	String gear_type;
//	public Gear(String gear_type)
//	{
//		this.gear_type=gear_type;
//	}
	
	//using getter and setter
	private String gear_type;

	public String getGear_type() 
	{
		return gear_type;
	}

	public void setGear_type(String gear_type)
	{
		this.gear_type = gear_type;
	}
}
public class Car1 {
//	int model;
//	String car_Name;
//	int price;
//	Gear g;
//	Engine e;
//	public Car1(int model,String car_Name,int price,Gear g,Engine e)
//	{
//		this.model=model;
//		this.car_Name=car_Name;
//		this.price=price;
//		this.e=e;
//		this.g=g;
//	}
//	public String toString()
//	{
//		return"model No:"+model+" Car name: "+car_Name+" price: "+price+g+e;
//	}
	
	
//  using getter and setter
	private int model;
	private String car_Name;
	private int price;
	private Gear g;
	private Engine e;
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCar_Name() {
		return car_Name;
	}
	public void setCar_Name(String car_Name) {
		this.car_Name = car_Name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Gear getG() {
		return g;
	}
	public void setG(Gear g) {
		this.g = g;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public static void main(String[] args) {
//		Car1 obj = new Car1(2008, "Maruti Suzuki", 400000, new Gear("Automatic") ,new Engine("Petrol", "15-05-2023"));
//		System.out.println(obj);
		
		
		Car1 obj = new Car1();
		obj.setCar_Name("Maruti Suzuki");
		obj.setModel(2008);
		obj.setPrice(400000);
		obj.setE(new Engine());
		obj.setG(new Gear());
		Engine e= obj.getE();
		e.setEng_Type("Petrol");
		e.setCleanUpdate("15-05-2023");
		obj.setG(new Gear());
		Gear g= obj.getG();
		g.setGear_type("Automatic");
		System.out.println("Car details: \n"+obj.car_Name+" model no: "+obj.getModel()+" price : "+obj.getPrice());
		System.out.println("Engine Details: \nEngine Type: "+e.getEng_Type()+" clean up date: "+e.getCleanUpdate());
		System.out.println("Gear Type: "+g.getGear_type());
		
	}

}
