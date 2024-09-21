package com.common_ck;
/*
 * 
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is Tops Tech....");
	
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	
	s1.insert(0, "Hii ");
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	
	s1.append("surat");
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	
	s1.delete(0, 4);
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	
	s1.replace(0, 4, "Here");
	System.out.println("Original string is :"+s1);
	System.out.println("Length of string is :"+s1.length());
	
}

}
