package com.oops;
/*
 * Constructor: it is a special member function which is 
 * initialized by its own
 * 
 * 1. same name as class name
 * 2. no return type
 * 3. automatically invoked whenever object is cleared
 * 
 * types of constructor
 * 1. default without constructor
 * 2. parameterized: with parameter
 * 3. copy : object is parameter
 * 
 */
class Box{
	double length,width,height;
	
	//1. default without constructor
	public  Box() {
		System.out.println("In default Constructor");
		length=1;
		width=2;
		height=3;	
	}
	
	//2.Parameterized : with parameter
	public  Box(double l,double w,double h) {
		System.out.println("In parameter Constructor");
		length=l;
		width=w;
		height=h;
		
	}
	//3.copy : object is a parameter
	public  Box(Box b) {
		System.out.println("In copy Constructor");
		length=b.length;
		width=b.width;
		height=b.height;	
	}
	
	
	public void VolOfBOX() {
		System.out.println("volume of box is :"+length*width*height);
		
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	Box b1=new Box();
	b1.VolOfBOX();
	Box pc=new Box(10, 20, 30);
	pc.VolOfBOX();
	Box ccBox=new Box(pc);
	ccBox.VolOfBOX();
}

}
