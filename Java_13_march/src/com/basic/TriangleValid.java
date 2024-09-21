package com.basic;

/*Write a program to check whether a triangle is valid or not, 
when the three angles of the triangle are entered through the 
keyboard. A triangle is valid if the sum of all the three angles 
is equal to 180 degrees. 
 * 
 */

public class TriangleValid {
public static void main(String[] args) {
	
	int a,b,c,sum;
	a=60;
	b=60;
	c=60;
	sum=a+b+c;
	
	if (sum==180) {
		System.out.println("Triangle is valid");
		
	} else {
		System.out.println("Triangle is not valid");

	}
}

}
