package programs.QAFOX;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        
        // Consume the leftover newline character
        scanner.nextLine();
        
        System.out.println("Enter the operator (+, -, /, *):");
        char operator = scanner.nextLine().charAt(0);
        
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                // Handle division by zero
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = firstNumber / (double) secondNumber; // Cast to double for accurate division
                }
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Invalid operator given by the user, hence operation failed.");
                validOperation = false;
                break;
        }
        
        if (validOperation) {
            System.out.println("The result of the operation is: " + result);
        }
        
        scanner.close();
    }
}
