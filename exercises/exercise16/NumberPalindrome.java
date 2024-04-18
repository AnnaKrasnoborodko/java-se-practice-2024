/* Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false.

Check the tips below for more info about palindromes.
Example Input/Output
•	isPalindrome(-1221); → should return true
•	isPalindrome(707); → should return true
•	isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
*/

package pl.globallogic.exercises.exercise16;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number:  ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number);
        String reverseNumberStr = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reverseNumberStr += numberStr.charAt(i);
        }
        return numberStr.equals(reverseNumberStr);
    }
}

