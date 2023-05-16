package com.accessModifire;

public class SubClass {
public static void main(String[] args) {
	SuperClass obj= new SuperClass();
	//obj.son(); private properties not accessible in other class of same package also
	obj.parent();// default properties can access in other class of same package
	obj.uncle();// protected properties can access in other class of same package
	obj.grandFather();//public properties can access in other class of same package
}
}
