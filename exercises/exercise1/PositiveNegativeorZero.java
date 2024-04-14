//Positive, Negative or Zero
//Write a method called checkNumber with an int parameter number.
//The method should not return any value, and it needs to print out:
//•	"positive" if the parameter number is > 0
//•	"negative" if the parameter number is < 0
//•	"zero" if the parameter number is equal to 0
//NOTE: The checkNumber method needs to be defined as public static like we have been doing so far in the course.

package pl.globallogic.exercises.exercise1;

import java.util.Scanner;

public class PositiveNegativeorZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int number = scanner.nextInt();
        checkNumber(number);
    }
    public static void checkNumber(int number) {
        String result = "";
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        System.out.println("Introduced value " + number + " is " + result);
    }
}