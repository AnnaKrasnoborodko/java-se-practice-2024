/* Area Calculator
Write a method named area with one double parameter named radius.
The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

For formulas and PI value please check the tips below.
Examples of input/output:
•	area(5.0); should return 78.53975
•	area(-1);  should return -1 since the parameter is negative
•	area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
•	area(-1.0, 4.0);  should return -1 since first the parameter is negative
TIP: The formula for calculating the area of a rectangle is x * y.
TIP: The formula for calculating a circle area is radius * radius * PI.
TIP: For PI use a constant from Math class e.g. Math.PI
*/

package pl.globallogic.exercises.exercise9;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius value:  ");
        double radius = scanner.nextDouble();
        Scanner side1 = new Scanner(System.in);
        System.out.println("Please enter the first side value:  ");
        double x = side1.nextDouble();
        Scanner side2 = new Scanner(System.in);
        System.out.println("Please enter the second side value:  ");
        double y = side2.nextDouble();
        System.out.println(area(radius));
        System.out.println(area(x, y));
    }
    public static double area(double radius) {
        if(radius > 0) {
            return radius * radius * Math.PI;
        } else {
            return -1;
        }
    }
    public static double area(double x, double y) {
        if (x > 0 && y > 0) {
            return x * y;
        } else {
            return -1;
        }
    }
}
