/* Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.

The method should return the sum of the even digits within the number.

If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
•	getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
•	getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
•	getEvenDigitSum(-22); → should return -1 since the number is negative
*/

package pl.globallogic.exercises.exercise18;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any complex number:  ");
        int number = scanner.nextInt();
        System.out.println(getEvenDigitSum(number));
    }

    public static long getEvenDigitSum(int number) {
        String numberStr = String.valueOf(number);
        long sumEven = 0;
        if (number > 0) {
            for (int i = 0; i < numberStr.length(); i++) {
                if ((Integer.parseInt(String.valueOf(numberStr.charAt(i))) % 2 == 0)) {
                    sumEven += Integer.parseInt(String.valueOf(numberStr.charAt(i)));
                }
            }
            return sumEven;
        } else {
            return -1;
        }
    }
}
