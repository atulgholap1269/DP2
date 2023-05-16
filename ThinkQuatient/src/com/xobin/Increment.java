package com.xobin;

public class Increment {
	final static int i=2;
	public static void main(String[] args) {
		for(int k=0; k<3;k++)
		{
			switch(k)
			{
			case i:System.out.println("0");
			case i-1:System.out.println("1");
  			case i-2:System.out.println("2");
			}
		}
	}

}
