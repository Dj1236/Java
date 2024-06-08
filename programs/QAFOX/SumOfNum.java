package programs.QAFOX;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int first_number = sc.nextInt();
        System.out.println("enter the second number");
        int second_number = sc.nextInt();
        System.out.println("the sum of both number is :" +(first_number+second_number));
        sc.close();
    }
    
}
