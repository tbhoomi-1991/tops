package com.basic;

import java.util.Scanner;

/*
 * loop-Two numbers are entered through the keyboard. Write a 
program to find the value of one number raised to the power 
of another.
 */
public class BaseExponent {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	 // Input first number
    System.out.print("Enter the base number: ");
    double base = scanner.nextDouble();

    // Input second number
    System.out.print("Enter the exponent: ");
    double exponent = scanner.nextDouble();

    // Calculate power using Math.pow function
    double result = Math.pow(base, exponent);

    // Print the result
    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
}

}
