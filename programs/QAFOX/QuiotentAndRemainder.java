package programs.QAFOX;

import java.util.Scanner;

public class QuiotentAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = scanner.nextInt();
        System.out.println("enter teh divisor:");
        int divisor = scanner.nextInt();
        System.out.println("the quoitent of the number is :" + (num/divisor));
        System.out.println("the remainder of the number is:"+ (num % divisor));
        scanner.close();
    }
}
