package com.basic;
/*
 * Write a program to Check whether a character is a vowel or consonant using switch statement.
 */
public class VowelConsonent {
public static void main(String[] args) {
	
	char ch='f';
	
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch + " is vowel");
		break;
		default:
		System.out.println(ch + " is consonant");
	
	}
	
}

}
