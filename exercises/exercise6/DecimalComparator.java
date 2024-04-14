/* DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
EXAMPLES OF INPUT/OUTPUT:
•	areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
•	areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
•	areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
•	areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
*/

package pl.globallogic.exercises.exercise6;

import java.util.Scanner;

public class DecimalComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first parameter:  ");
        double param1 = scanner.nextDouble();
        Scanner param = new Scanner(System.in);
        System.out.println("Enter the second parameter:  ");
        double param2 = param.nextDouble();
        System.out.println(areEqualByThreeDecimalPlaces(param1, param2));
    }
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        if ((int) param1*1000 == (int)param2*1000) {
            return true;
        } else {
            return false;
        }
    }
}
