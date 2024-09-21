package com.basic;

import java.lang.classfile.AnnotationValue.OfAnnotation;
import java.time.Period;

/*
 * If the total selling price of 15 items and the total profit earned 
on them is input through the keyboard, write a program to 
find the cost price of one item.
 */
public class CostPrice {
public static void main(String[] args) {
	
	float TSP15item = 7456;
	float TPP15item = 5678;
	System.out.println("Total selling price of 15 items is :"+TSP15item);
	System.out.println("Total profit Price of 15 items is :"+TPP15item);
	
	
	float cp = TSP15item-TPP15item;
	cp= cp/15;
	System.out.println("Cost Price per item is :"+cp);
	
	
	
	
	
	
	
}

}
