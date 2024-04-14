/*Equal Sum Checker
Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
EXAMPLES OF INPUT/OUTPUT:
•	hasEqualSum(1, 1, 1);  should return false since 1 + 1 is not equal to 1
•	hasEqualSum(1, 1, 2);  should return true since 1 + 1 is equal to 2
•	hasEqualSum(1, -1, 0);  should return true since 1 + (-1) is 1 - 1 and is equal to 0
*/

package pl.globallogic.exercises.exercise7;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class EqualSumCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first parameter:  ");
        int param1 = scanner.nextInt();
        Scanner param = new Scanner(System.in);
        System.out.println("Enter the second parameter:  ");
        int param2 = param.nextInt();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the third parameter:  ");
        int param3 = number.nextInt();
        System.out.println(hasEqualSum(param1, param2, param3));
    }
    public static boolean hasEqualSum(int param1, int param2, int param3) {
        return sum(param1, param2) == param3;
    }
 }
