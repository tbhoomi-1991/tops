package com.basic;

import java.util.Scanner;

/*
 * Write a program to Find the number of days in a month using a switch statement.
 */
public class NoofdaysSwitch {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int mon=0;
	int days;
	System.out.println("Enter the month number : ");
	mon=input.nextInt();
	
	switch(mon) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("Number of days 31 ");
		break;
	case 2:
		System.out.println("number of days  28");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("number of days 30");
		break;
		
	
	}
	
}

}
