package com.basic;
/*for
 * Loop : iterative,repetitive
 * 
 * 1. entry check
 * for:
 * syn:
 * for(initialization;condition;incree/decree)
 * {
 * statement
 * }
 * while:
 * initialization;
 * 
 * while(condition)
 * {
 * statement
 * incree/decree;
 * }
 * 2. exit check
 * do while
 * syn:
 * do{
 * statement
 * incree/decree;
 * }while(condition)
 * 
 * 
 */
public class LoopingDemo {
public static void main(String[] args) {
	
	for (int i = 1; i <= 5; i++) {
		System.out.println(i);
		
	System.out.println("for while loop");
	int j = 1;
	while (j<=5) {
		System.out.println(j);
		j++;
		
		
	System.out.println("do while loop");
	
	int k=1;
	do {
		System.out.println(k);
		k++;
	} while (k<=5);
		
	}
	
		
	}
}
}
