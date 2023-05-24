package com.assignmentsInheritanceAndPolymorphism;
class IPLTeam
{
	public void play()
	{
		System.out.println("All team plays a cricket");
	}
}
public class CSK extends IPLTeam {
  public static void main(String[] args) {
	  CSK obj = new CSK();
	  obj.play();
}
}
