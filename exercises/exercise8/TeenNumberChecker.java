/* Teen Number Checker
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
Write a method named hasTeen with 3 parameters of type int.
The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
EXAMPLES OF INPUT/OUTPUT:
•	hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
•	hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
•	hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
Write another method named isTeen with 1 parameter of type int.
The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
EXAMPLES OF INPUT/OUTPUT:
•	isTeen(9);  should return false since 9 is in not range 13 - 19
•	isTeen(13);  should return true since 13 is in range 13 - 19
*/

package pl.globallogic.exercises.exercise8;

import java.util.Scanner;

public class TeenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first age:  ");
        int age1 = scanner.nextInt();
        Scanner param = new Scanner(System.in);
        System.out.println("Enter the second age:  ");
        int age2 = param.nextInt();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the third age:  ");
        int age3 = number.nextInt();
        System.out.println(hasTeen(age1, age2, age3));
        Scanner check = new Scanner(System.in);
        System.out.println("Enter an age to check:  ");
        int ageCheck = scanner.nextInt();
        System.out.println(isTeen(ageCheck));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return (age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19);
    }

    public static boolean isTeen(int ageCheck) {
        return (ageCheck >= 13 && ageCheck <= 19);
    }
}
