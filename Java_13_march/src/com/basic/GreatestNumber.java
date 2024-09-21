package com.basic;
/*
 * Write a program to find the greatest of the three numbers 
entered through the keyboard using conditional operators. 
 */
public class GreatestNumber {
public static void main(String[] args) {
	int x,y,z,max;
	x=23;
	y=65;
	z=45;
	System.out.println("The X value is "+x);
	System.out.println("The y value is :"+y);
	System.out.println("The z value is :"+z);
	
	max=z;
	
	max = (max<y ? y : max);
	max = (max<z ? z : max);
	System.out.println("The greatest number is "+max);
}

}
