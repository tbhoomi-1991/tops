package com.basic;

/*
 * If the marks obtained by a student in five different subjects 
are input through the keyboard, find out the aggregate marks 
and percentage marks obtained by the student. Assume that 
the maximum marks that can be obtained by a student in each 
subject is 100.
 */
public class AggregatemarksPercentagemarks {
public static void main(String[] args) {
	
	int s1=60, s2=59, s3=78, s4=55, s5=82;
	int am=s1+s2+s3+s4+s5;
	
	System.out.println("Aggregate marks is :"+am);
	System.out.println("Percentage is :"+am*100/500);
	
	
}
}
