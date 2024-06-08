package programs.Sprograms;

import java.util.Scanner;

public class Fibonacci {

    // Method to generate Fibonacci sequence up to a given number
    public static void generateFibonacciUpTo(int maxNumber) {
        int first = 0, second = 1;

        // Print Fibonacci numbers up to maxNumber
        while (first <= maxNumber) {
            System.out.print(first + " ");

            // Calculate the next number
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the maximum number for Fibonacci sequence: ");
        int maxNumber = scanner.nextInt();

        // Validate the input
        if (maxNumber < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Generate and print the Fibonacci sequence up to maxNumber
            System.out.println("Fibonacci sequence up to " + maxNumber + ":");
            generateFibonacciUpTo(maxNumber);
        }

        // Close the scanner
        scanner.close();
    }
}
