package com.basic;
/*
 * In a town, the percentage of men is 52. The percentage of 
total literacy is 48. If total percentage of literate men is 35 of 
the total population, write a program to find the total number 
of illiterate men and women if the population of the town is 
80,000.
 */

public class MenWomen {
public static void main(String[] args) {
	int pop=80000;
	int popmen=(52*pop)/100;
	int popwomen=pop-popmen;
	int poplit=(48*pop)/100;
	int litmen=(35*popmen)/100;
	int litwomen=poplit-litmen;
	int unlitmen=popmen-litmen;
	int unlitwomen=popmen-litwomen;
	
	System.out.println("Total population is :"+pop);
	System.out.println("Population of men is :"+popmen);
	System.out.println("Population of women is :"+popwomen);
	System.out.println("Poppulation of litrate is :"+poplit);
	System.out.println("litrate men is :"+litmen);
	System.out.println("litrate women is :"+litwomen);
	System.out.println("unlitrate men is :"+unlitmen);
	System.out.println("unlitwomen is :"+unlitwomen);
	
	
	
}

}
