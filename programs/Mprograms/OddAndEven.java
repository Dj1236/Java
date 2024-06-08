
package programs.Mprograms;

import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int evenDigit = 0;
        int oddDigit = 0;
        int remainder;
        while (num > 0) {
            remainder = num % 10;
            if (remainder % 2 == 0) {
                evenDigit = evenDigit + remainder;
                } else {
                    oddDigit = oddDigit + remainder;
                    }
                    num = num / 10;
                    }
                    System.out.println("The sum of even digits is: " + evenDigit);
                    System.out.println("The sum of odd digits is: " + oddDigit);
                    sc.close();
    }

    
}