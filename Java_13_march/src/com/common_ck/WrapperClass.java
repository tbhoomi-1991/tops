package com.common_ck;
/*
 * Wrapper class : conversion of data from primitive to
 * non primitive and vice a versa
 * 
 * data type                Wrapper class
 * int                      Integer
 * float                    Float
 * 
 * Autoboxing : direct value given to the object
 * 
 * Boxing : Value given to the variable to object
 * 
 * unboxing : object to varible
 * 
 * object : root (parent) class of java by default
 */

class A{
	public void display() {
		System.out.println("this is class A");
		
	}
}
public class WrapperClass {
public static void main(String[] args) {
	
	Integer i1=new Integer(10);
	
	System.out.println("Auto boxing is :"+i1);
	
	int i2=20;
	
	Integer i3=new Integer(i2);
	
	System.out.println("Boxing is :"+i3);
	
	int i4=i1;
	
	String s1="786";
	
	
	
	String s2="100";
	
	System.out.println(s1+s2);
	
	int i5=Integer.parseInt(s1);
	int i6=Integer.parseInt(s2);
	
	System.out.println(i5+i6);
	
	A a=new A();
	System.out.println(s1.hashCode());
	
	
}

}
