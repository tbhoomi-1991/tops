package com.basic;
/*
 * Any year is input through the keyboard. Write a program to 
determine whether the year is a leap year or not. 
(Hint: Use the % (modulus) operator).
 */

public class LeapYear {
public static void main(String[] args) {
	
	int year=2023;
	
	if (year%4==0) {
		System.out.println("Year is leap year");
		
	} else {
		System.out.println("year is not leap year");

	}
}
	

}
