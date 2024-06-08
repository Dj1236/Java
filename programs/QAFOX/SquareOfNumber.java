package programs.QAFOX;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("the square of the number is :"+(num*num));
    }
    
}
