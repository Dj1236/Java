package programs.QAFOX;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        sc.close();
        int reverseNumber = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverseNumber = (reverseNumber*10)+ remainder;
            num = num/10;

            
        }
    }
    
}
