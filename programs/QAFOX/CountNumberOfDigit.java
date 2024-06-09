package programs.QAFOX;

import java.util.Scanner;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of digit");
        int num = sc.nextInt();
        int digitCount =0;
        while (num!=0) {
            num = num /10;
            digitCount++;

            
        }
        System.out.println("the total number of digit is:"+digitCount);
        sc.close();
    }
    
}
