/* Write a method called readInteger() that has no parameters and returns an int.
It needs to read in an integer from the user - this represents how many elements the user needs to enter.
Write another method called readElements() that has one parameter of type int
The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
*/
package pl.globallogic.exercises.exercise42;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = readInteger(scanner);
        int[] elements = readElements(numberOfElements, scanner);
        int minElement = findMin(elements);
        System.out.println("Min element is: " + minElement);
    }
    public static int readInteger(Scanner scanner) {
        System.out.println("Please enter number of elements:  ");
        int size = scanner.nextInt();
        return size;
    }
    public static int[] readElements(int size, Scanner scanner) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        } return min;
    }
}
