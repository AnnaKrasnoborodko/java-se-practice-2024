/* Largest Prime
Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
EXAMPLE INPUT/OUTPUT:
•	getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
•	getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
•	getLargestPrime (0); should return -1 since 0 does not have any prime numbers
•	getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
•	getLargestPrime (-1); should return -1 since the parameter is negative
*/

//NOT CORRECT OUTPUT BUT VERY CLOSE :)

package pl.globallogic.exercises.exercise26;

import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int number = scanner.nextInt();
        System.out.println(getLargestPrime(number));
    }

    public static int getLargestPrime(int number) {
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        continue;
                    }
                    return i;
                }
            }
        }
        return -1;
    }
}

