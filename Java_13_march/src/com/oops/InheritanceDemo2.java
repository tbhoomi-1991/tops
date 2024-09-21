package com.oops;
/*
 * Hierarchical : one parent multiple child
 */

class parent{
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name="salimkhan";
		ph_no=8548548902l;
		
		
	}
}
class child1 extends parent{
	String name="salman";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+" call "+ph_no);
		
	}
}
class child2 extends parent{
	String name="suhail";
	public void show() {
		System.out.println("For any complain of "+name+" "+p_name+" call "+ph_no);
		
		
	}
}
public class InheritanceDemo2 {
public static void main(String[] args) {
	child1 c1=new child1();
	c1.setParent();
	c1.show();
	
	child2 c2=new child2();
	c2.setParent();
	c2.show();
	
	
}

}
