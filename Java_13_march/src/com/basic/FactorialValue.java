package com.basic;

import java.util.Scanner;

/*
 * loop- Write a program to find the factorial value of any number 
entered through the keyboard.
 */
public class FactorialValue {
public static void main(String[] args) {

	
	Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter a number to find its factorial: ");
    
    // Read the next integer from the input
    int number = scanner.nextInt();

    // Calculate the factorial of the entered number
    long factorial = 1;
    for (int i = 1; i <= number; ++i) {
        factorial *= i;
    }

    // Print the factorial
    System.out.println("Factorial of " + number + " is: " + factorial);

	
	
	
	
}

}
