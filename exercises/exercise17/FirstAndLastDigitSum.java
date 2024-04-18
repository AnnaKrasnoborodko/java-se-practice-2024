/* First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.

The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.
Example input/output
•	sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
•	sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
•	sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
•	sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
•	sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
*/

package pl.globallogic.exercises.exercise17;

import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any complex number:  ");
        int number = scanner.nextInt();
        System.out.println(sumFirstAndLastDigit(number));
    }

    public static int sumFirstAndLastDigit(int number) {
        String numberStr = String.valueOf(number);
        String reverseNumberStr = "";
        if (number > 0) {
            for (int i = numberStr.length() - 1; i >= 0; i--) {
                reverseNumberStr += numberStr.charAt(i);
            }
            return Integer.parseInt(String.valueOf(numberStr.charAt(0))) + Integer.parseInt(String.valueOf(reverseNumberStr.charAt(0)));
        }
        return -1;
    }
}
