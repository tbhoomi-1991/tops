package com.basic;
/*
 * If the ages of Ram, Shyam and Ajay are input through the 
keyboard, write a program to determine the youngest of the 
three. 
 */
public class YoungestAge {
public static void main(String[] args) {
	
	int ram,shyam,ajay;
	ram=34;
	shyam=41;
	ajay=50;
	System.out.println("The age of ram is :"+ram);
	System.out.println("The age of shyam is :"+shyam);
	System.out.println("The age of ajay is :"+ajay);
	
	if (ram<shyam && ram<ajay) {
		System.out.println("ram is youngest");
		
	}	if (shyam<ram && shyam<ajay) {
		System.out.println("shyam is youngest");
		
	} else if (ajay<ram && ajay<shyam) {
		System.out.println("ajay is youngest");
		
	} {

	}
	
		
	

	
	
	
}

}
