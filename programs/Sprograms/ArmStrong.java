package programs.Sprograms;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int cube = 0;
        while (num > 0) {
            int rem = num % 10;
            cube = cube + (rem * rem * rem);    
            num = num / 10;

            
        }
        if (temp == cube) {
            System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong number");
                }
                
    }
    
}
