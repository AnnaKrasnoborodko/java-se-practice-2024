/* Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
•	hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
•	hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
•	hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
*/

package pl.globallogic.exercises.exercise19;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Please enter the first number:  ");
        int param1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Please enter the second number:  ");
        int param2 = num2.nextInt();
        System.out.println(hasSharedDigit(param1, param2));
    }

    public static boolean hasSharedDigit(int param1, int param2) {
        String param1Str = String.valueOf(param1);
        String param2Str = String.valueOf(param2);
        int x = param1Str.length();
        int y = param2Str.length();
        boolean a = false;
        if (param1 >= 10 && param1 <= 99 && param2 >= 10 && param2 <= 99) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (param1Str.charAt(i) == param2Str.charAt(j)) {
                        a = true;
                        y--;
                        x--;
                    }
                }
            }
            return a;
        } else {
            return false;
        }
    }
}
