package com.oops;
/*
 * Method overriding : method with same prototype.
 * Super keyword : call the method of immediate parent
 */
class A{
	public A() {
		System.out.println("In class A constructor");
	}
	public void show() {
		System.out.println("In class A show");
		
	}
}
class B extends A{
	public B() {
		System.out.println("In class B constructor");
	}
	public void show() {
		super.show();
		System.out.println("In class B Show");
		
	}
}
class C extends B{
	public C() {
		System.out.println("In class C constructor");
	}
	public void show() {
		super.show();
		System.out.println("In class C show");
		
	}
}
public class ConstructorChaning {
public static void main(String[] args) {
	C c=new C();
	c.show();
	

	
	
}

}
