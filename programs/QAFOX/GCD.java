package programs.QAFOX;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1=scanner.nextInt();
        System.out.println("enter the second number:");
        int num2 =scanner.nextInt();
        scanner.close();
        // logic 
        int gcd=0;
        for(int i=1;i<=num1 && i<=num2;i++){
            if (num1%i==0 && num2%i==0) {
                gcd =i;
            }

        }
        System.out.println("the gcd of both the number is :"+gcd);
    }
    
}
