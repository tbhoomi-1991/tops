package com.basic;
/*
 * Given the length and breadth of a rectangle, write a program to 
find whether the area of the rectangle is greater than its 
perimeter. For example, the area of the rectangle with length = 5 
and breadth = 4 is greater than its perimeter.
 */
public class AreaPerimeter {
public static void main(String[] args) {
	
	float length,breadth,area,perimeter;
	length=7;
	System.out.println("the length is :"+length);
	breadth=2;
	System.out.println("the breadth is :"+breadth);
	
	area=length*breadth;
	
	perimeter= 2* (length+breadth);
	
	System.out.println("The area of rectangle is :"+area);
	System.out.println("The perimeter of rectangle is :"+perimeter);
	
	if (area>perimeter) {
		System.out.println("Area of rectangle is greater than its perimeter");
		
		
	} else 
	  System.out.println("perimeter of rectangle is greater than its area ");
	{

	}
	
	
	
	
	
	
    
    
	
	
}

}
