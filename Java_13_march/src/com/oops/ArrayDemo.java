package com.oops;

import java.util.Iterator;
import java.util.Scanner;

/*Array : collection of data of similar type
 * 1D Array
 * Always start with index 0
 * Size-1
 * if size is greater than assigned size it gives error
 * ArrayIndexOutofBoundsException
 * 2D Array
 * jagged array
 */
public class ArrayDemo {
public static void main(String[] args) {
	// roll no 5 student
	// declaration of array
	int [] a= {1,2,3,4,5};
	// initialization of array
	int [] b=new int[5];
	
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < b.length; i++) {
		System.out.println("Enter a value");
		b[i]=sc.nextInt();
		
	}
	System.out.println("Enter value");
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
		
		
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(a[i]);
		
	}
}

}
