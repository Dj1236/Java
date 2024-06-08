package programs.Mprograms;

import java.util.Scanner;

public class countingNumberInDigit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        int num = sc.nextInt();
        int digitCount = 0;
        while (num>0) {
            num = num/10;
            digitCount++;
            
        }
        System.out.println("number of digit in number:"+digitCount);
        sc.close();
    }

    
}
