package programs.Mprograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = sc.nextInt();
        int remainder;
        int SumOfDigit1 = 0;
        while (number>0) {
            remainder = number % 10;
            SumOfDigit1 = SumOfDigit1 + remainder;
            number = number / 10;

            
        }
        System.out.println("the sum of the number is :" + SumOfDigit1);
        sc.close();
    }
    
}
