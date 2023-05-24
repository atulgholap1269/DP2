package com.assignmentsInheritanceAndPolymorphism;
  interface Cakeable
  {
	  void bake();
  }
  class BlackForest implements Cakeable
  {
	  public void bake()
	  {
		  System.out.println("BlackForest cake are bake properly");
	  }
  }
public class Strawberry implements Cakeable{
 public void bake()
 {
	 System.out.println("Strawberry cake are bake properly");
 }
}
