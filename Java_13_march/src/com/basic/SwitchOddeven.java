package com.basic;

import java.util.Scanner;

/*
 * Write a program to Check whether the number is even or odd using switch statement.
 */
public class SwitchOddeven {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	int num=0;
	System.out.println("Enter the number : ");
	num=input.nextInt();
	switch (num % 2) {
	
	case 0:
		System.out.println("This is a even number");
		break;
		
	case 1:
		System.out.println("This is a odd number");
		break;
	}
	
}

}
