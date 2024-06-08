package programs.QAFOX;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = scanner.nextInt();
        int initialNumber = number;
        System.out.println("enter the power of number:");
        int power = scanner.nextInt();
        for (int i = 1; i<=power ;i++){
            initialNumber = number*initialNumber;
        }
        System.out.println(initialNumber);
        scanner.close();
    }
    
}
