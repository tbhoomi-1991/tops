package com.basic;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Armstrong numbers between 1 and 500:");

    for (int number = 1; number <= 500; number++) {
        if (isArmstrong(number)) {
            System.out.println(number);
        }
    }
}

// Function to check if a number is Armstrong or not
public static boolean isArmstrong(int number) {
    int originalNumber, remainder, result = 0, n = 0;

    originalNumber = number;

    // Count number of digits
    while (originalNumber != 0) {
        originalNumber /= 10;
        ++n;
    }

    originalNumber = number;

    // Calculate sum of nth power of digits
    while (originalNumber != 0) {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, n);
        originalNumber /= 10;
    }

    // Check if number is Armstrong
    if (result == number)
        return true;
    else
        return false;
}

}

