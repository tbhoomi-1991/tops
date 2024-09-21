package com.basic;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 * If a five-digit number is input through the keyboard, write a 
program to calculate the sum of its digits.
 */


public class FivedidgitNumbers {
public static void main(String[] args) {
	
	int a,b,c,d,e,num,rev,ori;
	num=22222;
	System.out.println("the five digit number is :"+num);
	
	ori=num;
	a=num%10;
	num=num/10;
	b=num%10;
	num=num/10;
	c=num%10;
	num=num/10;
	d=num%10;
	num=num/10;
	e=num%10;
	num=num/10;
	
	rev=a*10000+b*1000+c*100+d*10+e*1;
	
	if (ori==rev) {
		System.out.println("Ori number is equal to reverse number");
		
	} else {
		System.out.println("ori number is not equal to reverse number");

	}
}	

}
