package com.randomCodes;

    /*
    *   Calculate the GCD of two numbers
    *   Requirements: number1 > number2
    */

    public class GreatestCommonDivisor {
    public int calcGCD(int number1, int number2) {
        if (number2 == 0)
            return number1;
        else
            return calcGCD(number2, number1 % number2);
    }
}
