package com.basic;

import java.util.Iterator;
import java.util.Scanner;

/*
 * loop-Write a program to calculate overtime pay of 10 employees. 
Overtime is paid at the rate of Rs. 12.00 per hour for every 
hour worked above 40 hours. Assume that employees do not 
work for fractional part of an hour. 
 */
public class OvertimeLoop {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	double overtimerate=12.00;
	int regularhours=40;
	
	for (int i = 1; i <=10; i++) {
		System.out.println("Enter the number of hours worked by employee"+i+":");
		int hoursworked=scanner.nextInt();
		
		if (hoursworked>regularhours) {
			int overtimehours=hoursworked-regularhours;
			double overtimepay=overtimehours*overtimerate;
			System.out.println("overtime pay for employee"+i+" is Rs"+ overtimepay);
			
		} else {
			System.out.println("No overtime pay for employee"+i);

		}
		
	}
	
}

	
}
