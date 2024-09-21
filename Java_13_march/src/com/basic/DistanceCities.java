package com.basic;


/*
 * The distance between two cities (in km.) is input through the 
keyboard. Write a program to convert and print this distance 
in meters, feet, inches and centimeters.
 */



public class DistanceCities {
public static void main(String[] args) {
	
	
	float distance =2;
	System.out.println("distance_km is  :"+distance);
	
	float meters=distance*1000;
	System.out.println("distance_meter is :"+meters);
	
	 float feet=distance*3280.84f;
	 System.out.println("distance_feet is :"+feet);
	 
	 float centimeters=distance*100000;
	 System.out.println("distance_centimeters is :"+centimeters);
	 
	 float inches=distance*39370.1f;
	 System.out.println("distance_inches is :"+inches);
	 
	

	
	
	
	
	
}

}
