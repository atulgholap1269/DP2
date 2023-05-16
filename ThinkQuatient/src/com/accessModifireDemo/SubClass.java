package com.accessModifireDemo;
import com.accessModifire.*;
public class SubClass extends SuperClass {
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		//obj.parent(); default properties can not access in other package
		obj.uncle();// protected properties can access in other package but only in sub class with the help of inheritance
		obj.grandFather();//public properties can access in anywhere in project.
	}

}
