package com.oops;

import java.util.Scanner;

/*
 * Scanner :
 * it is a class
 * derived from java. until package
 * main purpose is to take input from the user
 * it has argument as system.in
 * 
 * data type                  Data function
 * int                          nextInt()
 * float                        nextFloat()
 * double                       nextDouble
 * character                    next().CharAt(0)
 * 
 * string
 * word                          next()
 * read until space  is pressed
 * line 
 * read until enter is pressed
 */
public class ScannerDemo {
public static void main(String[] args) {
	
	int a,b;
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	System.out.println("enter a :");
	a=sc.nextInt();
	System.out.println("enter b :");
	b=sc.nextInt();
	
	System.out.println("sum is :"+(a+b));
	
	String name;
	//Scanner.nextLine(); // buffer clean
	System.out.println("enter your name :");
	name=sc1.nextLine();
	System.out.println("name is ;  "+name);
	
	 
	
	
	
	
}

}
