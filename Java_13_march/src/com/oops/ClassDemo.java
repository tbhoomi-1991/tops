package com.oops;
/*
 * 3.Encapsulation : wrapping of data
 * Access specifier
 * 1. private : only accessible within class
 * 2. protected : only accessible to child
 * 3. default : accessible within package
 * 4. public : accessible anywhere
 * 
 */

import com.oops.Student.child;

class Student{
	private int roll_no;
	protected String name,branch,city;
	
	public void setStudentData() {
		roll_no=1;
		name="komal";
		branch="cs";
		city="surat";
	}
	
	public void display() {
		//System.out.println("roll no...."+roll_no);
		//System.out.println("name....."+name);
		//System.out.println("branch...."+branch);
		//System.out.println("city....."+city);
		
		
	//}
}
class child extends Student{
	public void show() {
		System.out.println("roll no is :");
		System.out.println("name is :"+name);
		
	}
		
	}
}

public class ClassDemo {
public static void main(String[] args) {
	//Student s1=new Student();
	//s1.setStudentData();
	//s1.display();
	
	
	
	
	
	
	
	
			
}

}
