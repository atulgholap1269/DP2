package com.inherietence;
class Pen
{
	public void showPen()
	{
		System.out.println("Pocket contain pen");
	}
}
class Pouch extends Pen
{
	public void showPouch()
	{
		System.out.println("Pouch also pencil, pen, eraser");
	}
}
public class MultiBag extends Pouch {
	public void showBag()
	{
		System.out.println("Bag contain pouch, notebook, laptop");
	}
	public static void main(String[] args) {
		MultiBag obj = new MultiBag();
		obj.showPen();
		obj.showBag();
		obj.showPouch();
	
	
	
	
	}
}
