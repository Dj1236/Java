package programs.QAFOX;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = scanner.nextInt();
        System.out.println("enter the second number:");
        int b = scanner.nextInt();
        System.out.println("enter the third number:");
        int c = scanner.nextInt();
        scanner.close();
        if (a>b && a>c){
            System.out.println("a is largest");

        } else if (b>c) {
            System.out.println("b is largest");

            
        } else{
            System.out.println("c is largest");
        }
    }
}
