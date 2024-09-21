package com.basic;
/*
 * Write a program using conditional operators to determine 
whether a year entered through the keyboard is a leap year or 
not.
 */
public class LeapyearNot {
public static void main(String[] args) {
	
	int year = 2017;
	System.out.println("Year is : "+year);
	
	if ((year%4==0 && year%100!=0)|| year%400==0) {
		System.out.println("The year is a leap year");
		
	} else {
		System.out.println("The year is not a leap year");

	}
	
}

}
