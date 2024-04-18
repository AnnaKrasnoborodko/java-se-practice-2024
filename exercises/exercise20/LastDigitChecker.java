/*
Last Digit Checker
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
EXAMPLE INPUT/OUTPUT:
•	hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
•	hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
•	hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
EXAMPLE INPUT/OUTPUT
•	isValid(10); → should return true since 10 is within the range of 10-1000
•	isValid(468); → should return true since 468 is within the range of 10-1000
•	isValid(1051); → should return false since 1051 is not within the range of 10-1000
*/

package pl.globallogic.exercises.exercise20;

import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Please enter the first number:  ");
        int param1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Please enter the second number:  ");
        int param2 = num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.println("Please enter the third number:  ");
        int param3 = num3.nextInt();
        System.out.println("Result of 3 numbers is: " + hasSameLastDigit(param1, param2, param3));
        System.out.println("Result of 1 number is: " + isValid(param1));
    }
    public static boolean hasSameLastDigit( int param1, int param2, int param3) {
        if (param1 >= 10 && param1 <= 1000 && param2 >= 10 && param2 <= 1000 && param3 >= 10 && param3 <= 1000) {
            return ((param1 % 10 == param2 % 10) || (param1 % 10 == param3 % 10) || (param3 % 10 == param2 % 10));
        } else {
            return false;
        }
    }
    public static boolean isValid(int param1) {
        return param1 >= 10 && param1 <= 1000;
    }
}
