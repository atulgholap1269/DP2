package com.conatinment;
class Nib1
{
	private String material;
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public int getNibPrice()
	{
		return nibPrice;
	}
	public void setNibPrice(int nibPrice) 
	{
		this.nibPrice = nibPrice;
	}
	private int nibPrice;
}
class Pen1
{
	private String coloure;
	private String name;
	private int penPrice;
	private Nib1 b;
	public String getColoure()
	{
		return coloure;
	}
	public void setColoure(String coloure)
	{
		this.coloure = coloure;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getPenPrice() 
	{
		return penPrice;
	}
	public void setPenPrice(int penPrice)
	{
		this.penPrice = penPrice;
	}
	public Nib1 getB()
	{
		return b;
	}
	public void setB(Nib1 b)
	{
		this.b = b;
	}
	
}
public class BagGetterSetter {
	private String brandName;
	private int bagprice;
	private  Pen1 p;
	public String getBrandName()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	public int getBagPrice() 
	{
		return bagprice;
	}
	public void setBagPrice(int price)
	{
		this.bagprice = price;
	}
	public Pen1 getP() 
	{
		return p;
	}
	public void setP(Pen1 p) 
	{
		this.p = p;
	}

}
