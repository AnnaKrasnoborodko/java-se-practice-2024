/* Minutes To Years and Days Calculator
Write a method printYearsAndDays with parameter of type long named minutes.
The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
If the parameter is less than 0, print text "Invalid Value".
Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
XX represents the original value minutes.
YY represents the calculated years.
ZZ represents the calculated days.
EXAMPLES OF INPUT/OUTPUT:
•	printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
•	printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
•	printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
*/

package pl.globallogic.exercises.exercise10;

import java.util.Scanner;

public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of minutes:  ");
        long minutes = scanner.nextLong();
        printYearsAndDays(minutes);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes >= 0) {
            System.out.println(minutes + " min " + " = " + minutes / 525600 + " y and " + (minutes % 525600) / 1440 + " d ");
        } else {
            System.out.println("Invalid value");
        }
    }
}
