package programs.Sprograms;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        for(int i = 1; i<= power ;i++){
            result = result * num;
            
        }
        System.out.println("The power of number is: "+result);
            

    }
    
}
