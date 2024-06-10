package programs.QAFOX;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = scanner.nextInt();
        scanner.close();
        int ReverseNumber =0;
        while (num !=0) {
            int remainder = num % 10;
            ReverseNumber =(ReverseNumber*10) +remainder;
            num = num /10;

            
        }
        System.out.println(ReverseNumber);
    }
    
}
