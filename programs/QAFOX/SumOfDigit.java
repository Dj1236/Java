package programs.QAFOX;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the digit that you want to sum:");
        int digit = scanner.nextInt();
        int sum = 0;
        while (digit!=0) {
            sum = sum + digit % 10;
            digit = digit /10;
            
        }
        System.out.println("the sum of all the digit is :"+ sum);
        scanner.close();
    }
    
}
