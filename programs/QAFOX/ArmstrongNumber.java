package programs.QAFOX;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");

        int num = sc.nextInt();

        sc.close();

        int originalNumber = num;

        int cubeNumber = 0; 

        while (num != 0) {
            int remainder = num % 10;
            cubeNumber = cubeNumber +(remainder*remainder*remainder);
            num = num /10; 
        }
        
        if (originalNumber == cubeNumber) {
            System.out.println("the number is armstrong number");
            
        } else{
            System.out.println("the number is not armstrong number");
        }

    }
    
}
