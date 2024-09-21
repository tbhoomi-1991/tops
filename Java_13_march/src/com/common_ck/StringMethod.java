package com.common_ck;
/*
 * string : immutable : can not change the value
 * stringBuffer
 * wrapper
 * object
 */
		
public class StringMethod {
public static void main(String[] args) {
	String s1="This is Tops Trch";
	
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	System.out.println("to lower case :"+s1.toLowerCase());
	System.out.println("to uppercase :"+s1.toUpperCase());
	System.out.println("substring is :"+s1.substring(2));
	System.out.println("substring is :"+s1.substring(2,5));
	System.out.println("Length of string is :"+s1.length());
	System.out.println("char at :"+s1.charAt(0));
	
	if (s1.equalsIgnoreCase("This is Tops Tech")) {
		System.out.println("both strings are same");
		
	} else {
		System.out.println("both strings are different");

	}
	System.out.println("original string is :"+s1);

	
	
	
	
	
	
}
}

