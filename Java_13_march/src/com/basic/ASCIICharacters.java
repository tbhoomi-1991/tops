package com.basic;
/*
 * loop-Write a program to print all the ASCII values and their 
equivalent characters using a while loop. The ASCII values 
vary from 0 to 255. 
 */
public class ASCIICharacters {
public static void main(String[] args) {
	 int asciiValue = 0;
     
     // Print ASCII values and characters using a while loop
     while (asciiValue <= 255) {
         System.out.println("ASCII Value: " + asciiValue + ", Character: " + (char)asciiValue);
         asciiValue++;
     }
}

}
