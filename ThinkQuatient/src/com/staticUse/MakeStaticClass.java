package com.staticUse;
import com.staticUse.A.B;
import com.staticUse.A.C;
public class MakeStaticClass {
	public static void main(String[] args) {
		A objA=new A();
		A.B objB=objA.new B();//if you want create obj of non static inner class then you have to create the obj of outer class 
		C objC= new A.C();// if want create obj of static class then no need to create obj of outer class
	}

}
