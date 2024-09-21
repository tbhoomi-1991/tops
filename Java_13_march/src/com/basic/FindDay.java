package com.basic;
/*
 * According to the Gregorian calendar, it was Monday on the 
date 01/01/1900. If any year is input through the keyboard 
write a program to find out what is the day on 1st January of 
this year. 
 */

public class FindDay {
public static void main(String[] args) {
	
	int GivenYear=1990;
	int year=2001;
	
	int difference= year-GivenYear;
	int leapyear= difference/4;
	int nonleapyear= difference-leapyear;
	int days = (leapyear*366)+(nonleapyear*365);
	
	if (days %7 == 1) {
		System.out.println("Monday");
		
		
	}
	
	if (days %7 == 2) {
		System.out.println("Tuesday");
		
	if (days %7 == 3) {
		System.out.println("Wednesday");
	if (days %7 == 4) {
		System.out.println("Thursday");
	if (days %7 == 5) {
		System.out.println("Friday");
	if (days %7 == 6) {
		System.out.println("Saturday");
	if (days %7 == 7) {
		System.out.println("Sunday");
		
			
			
		}
			
			
		}
					
					
				}
				
				
			}
			
			
		}
		
		
	}
}

}
